package DB;

import java.util.ArrayList;

public class QueryBuilder {

    protected ArrayList<Where> wheres = new ArrayList();


    public QueryBuilder where(Where where) {
        wheres.add(where);

        return this;
    }
}
