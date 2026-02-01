package DB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grammar implements SqlAction{

    protected QueryBuilder query;

    protected ArrayList<Binding> bindings = new ArrayList<>();


    public Grammar(QueryBuilder query) {
        this.query = query;
    }


    public String compileSelec()
    {
        this.bindings.clear();

        String sql = "SELECT ";

        if (query.getColumns().isEmpty())
        {
            if ( query.isDistinct() )
            {
                sql += "distinct";
            }else{
                sql += "*";
            }
        }else{
            for (int i = 0; i < query.getColumns().size(); i++) {
                sql += query.getColumns().get(i) + "";

                if (i < query.getColumns().size() - 1)
                    sql += ", ";
            }
        }

        sql += " FROM "+query.getTableName();

        sql = this.compileWheres(sql);

        if ( query.getLimit() > 0)
        {
            sql += " LIMIT "+query.getLimit();
        }

        return sql;
    }

    public String compileWheres(String sql)
    {
//        for (int i = 0; i < query.getWheres().size(); i++) {
//            Where where = query.getWheres().get(i);
//
//            if ( i != 0)
//            {
//                sql += where.getBoolean()+" ";
//            }else{
//                sql += " WHERE ";
//            }
//
//            sql += where.getColumn()+" "+where.getComparator()+" ? ";
//
//            this.bindings.add( new Binding((String) where.getValue()) );
//        }
//
        return sql;
    }

    public ArrayList<Binding> getBindings() {
        return bindings;
    }

    @Override
    public String toSql() {
        return this.compileSelec();
    }
}
