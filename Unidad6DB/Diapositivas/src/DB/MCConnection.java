package DB;

import DB.Schema.Schema;

import java.sql.*;
import java.util.ArrayList;

public abstract class MCConnection {

    protected static final String USUARIO = "root";
    protected static final String PASSWORD = "root";

    // Abstract factory methods - subclasses implement
    protected abstract String getDBName();

    protected abstract int getPort();

    public Schema schema;

    public MCConnection() {
        schema = new Schema(this);
    }

    // Non-static instance methods use subclass overrides
    public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:" + getPort() + "/" + getDBName() + "?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        return DriverManager.getConnection(url, USUARIO, PASSWORD);
    }

    public ResultSet executeRaw(String sql, ArrayList<Binding> bindings) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);

        System.out.println(bindings.toString());
        for (int i = 0; i < bindings.size(); i++) {
            bindings.get(i).prepare(i + 1, ps);

        }

        return ps.executeQuery();
    }

    public static MCConnection instance(Class<? extends MCConnection> clazz) throws Exception {
        return clazz.getDeclaredConstructor().newInstance();
    }
}
