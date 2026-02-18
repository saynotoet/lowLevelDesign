package com.low.level.design.design.pattern.objectPoolDesignPattern;

public class Driver {
    public static void main(String[] args) {
        DBConnectionPoolManager dbConnectionPoolManager = DBConnectionPoolManager.getInstance();

        DBConnection dbConnection1 = dbConnectionPoolManager.getConnection();
        DBConnection dbConnection2 = dbConnectionPoolManager.getConnection();
        DBConnection dbConnection3 = dbConnectionPoolManager.getConnection();
        DBConnection dbConnection4 = dbConnectionPoolManager.getConnection();
        DBConnection dbConnection5 = dbConnectionPoolManager.getConnection();

        dbConnectionPoolManager.getConnection();
        dbConnectionPoolManager.releaseConnection(dbConnection1);
    }
}
