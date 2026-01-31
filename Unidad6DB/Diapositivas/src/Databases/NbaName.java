package Databases;

import DB.MCConnection;

public class NbaName extends MCConnection {


    @Override
    protected String getDBName() {
        return "nba";
    }

    @Override
    protected int getPort() {
        return 3309;
    }
}
