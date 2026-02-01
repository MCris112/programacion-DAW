package DB;

import Activities.Activity1.Jugador;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class  QueryBuilder<M extends  Model> implements SqlAction{

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

        this.grammar = new Grammar( this );
    }

    public QueryBuilder where( String column, String value)
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

    public String getTableName() {
        return tableName;
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
