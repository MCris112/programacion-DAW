package Databases;

import DB.MCConnection;

public class DawDB extends MCConnection {
    @Override
    protected String getDBName() {
        return "daw";
    }

    @Override
    protected int getPort() {
        return 3309;
    }
}
