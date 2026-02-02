package DB;

import Activities.Activity1.Jugador;
import DB.Contracts.DatabaseEnv;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class  QueryBuilder<M extends  Model> implements SqlAction, DatabaseEnv {

    protected MCConnection connection;

    protected String tableName;

    protected ArrayList<String> columns = new ArrayList<>();
    protected ArrayList<Where> wheres = new ArrayList<>();

    protected int limit = 0;

    protected Grammar grammar;

    protected boolean isDistinct = false;

    protected M model;


    public QueryBuilder(M model) {
        this.model = model;
        this.connection = new MCConnection(
                this.getDatabaseName(),
                this.getTableName(),
                this.getDatabasePort(),
                this.getDatabaseUserName(),
                this.getDatabaseUserPassword()
        );

        this.grammar = new Grammar( this );
    }


    /// ///////////////////////////////////////
    ///
    /// Database Configuration
    ///
    /// ///////////////////////////////////////

    @Override
    public String getDatabaseName() {
        return this.model.getDatabaseName();
    }

    @Override
    public String getDatabasePort() {
        return this.model.getDatabasePort();
    }

    @Override
    public String getDatabaseUserName() {
        return this.model.getDatabaseUserName();
    }

    @Override
    public String getDatabaseUserPassword() {
        return this.model.getDatabaseUserPassword();
    }

    @Override
    public String getTableName() {
        return this.model.getTableName();
    }

    public QueryBuilder where(String column, String value)
    {
        this.wheres.add( new Where( column, "=", value, "AND"  ) );
        return this;
    }

    public QueryBuilder where( String column, String comparator, Object value)
    {
        this.wheres.add( new Where( column,  comparator, value, "AND"  ) );
        return this;
    }

    public QueryBuilder where(Where where) {
        wheres.add(where);

        return this;
    }

    public QueryBuilder distinct()
    {
        this.isDistinct = true;
        return this;
    }

    public MCList<M> get() throws SQLException {
        ResultSet result = this.connection.executeRaw( this.grammar.compileSelec(), this.grammar.getBindings() );

        MCList<M> models = new MCList<M>();
        while( result.next() )
        {
            M model = (M) this.model.newModel();
            model.fromSqlResult(result);
            models.add( model );
        }

        return models;
    }

    @Override
    public String toSql() {
        return this.grammar.toSql();
    }

    public ArrayList<String> getColumns() {
        return columns;
    }

    public ArrayList<Where> getWheres() {
        return wheres;
    }

    public int getLimit() {
        return limit;
    }

    public QueryBuilder limit(int limit) {
        this.limit = limit;
        return this;
    }

    public boolean isDistinct() {
        return isDistinct;
    }
}
