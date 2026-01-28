package DB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.function.Consumer;

public class Schema {


    public static void create(String name , Consumer<DBTable> table ) throws SQLException {
        DBTable content = new DBTable(name, false);
        table.accept(content);

        executeDdl( content.toString() );
    }

    public static void createIfNotExists(String name , Consumer<DBTable> table ) throws SQLException {
        DBTable content = new DBTable(name, true);
        table.accept(content);

        executeDdl( content.toString() );
    }

    public static void drop(String name ) throws SQLException {
        executeDdl( "DROP TABLE "+name);
    }

    public static void dropIfExists(String name ) throws SQLException {
        executeDdl( "DROP TABLE IF EXISTS"+name);
    }

    // Helper for DDL (reused, safe)
    private static void executeDdl(String sql) throws SQLException {
        System.out.println("Executing: " + sql);
        try (Connection conn = MCConnection.getConnection();
             Statement stmt = conn.createStatement()) {
            int rows = stmt.executeUpdate(sql);
        }
    }
}
