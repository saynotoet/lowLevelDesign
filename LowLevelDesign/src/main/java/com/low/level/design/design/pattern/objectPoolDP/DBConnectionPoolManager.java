package com.low.level.design.design.pattern.objectPoolDP;

import java.util.*;

public class DBConnectionPoolManager {
    List<DBConnection> connectionsInUse = new ArrayList<>();
    List<DBConnection> freeConnections = new ArrayList<>();
    int INITIAL_POOL_SIZE = 5;
    int MAX_POOL_SIZE = 10;

    public DBConnectionPoolManager(){
        for(int i=0;i<INITIAL_POOL_SIZE;i++){
            freeConnections.add(new DBConnection());
        }
    }

    public DBConnection getConnection(){
        if(freeConnections.isEmpty() && connectionsInUse.size()<MAX_POOL_SIZE){
            freeConnections.add(new DBConnection());
        }
        else if(freeConnections.isEmpty() && connectionsInUse.size()>=MAX_POOL_SIZE){
            return null;
        }

        DBConnection connection = freeConnections.remove(freeConnections.size()-1);
        connectionsInUse.add(connection);
        return connection;
    }

    public void releaseConnection(DBConnection connection){
        if(null != connection){
            connectionsInUse.remove(connection);
            freeConnections.add(connection);
        }

    }


}
