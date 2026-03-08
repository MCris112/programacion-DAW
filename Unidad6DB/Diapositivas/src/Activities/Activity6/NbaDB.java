package Activities.Activity6;

import com.darkredgm.querymc.Database.ORM.DB;

public class NbaDB extends DB {
    public NbaDB(String tableName) {
        super(tableName);
    }

    @Override
    public String getDatabaseName() {
        return "nba";
    }
}
