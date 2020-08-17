package com.creativity.example.games;

import java.sql.*;


public class TestDB {
    /**
     * Muestra de estructura setUp y tearDown
     */

    private Connection dbConn;

    protected void setUp() {
        // dbConn = new Connection("",3000,"fred","foobar");
       // dbConn.commit();

    }

    protected void tearDown() {
         // dbConn.disconnect();
        // dbConn = null;
    }

    public void testAccountAccess() {
        // Uses dbConn
    }

    public void testEmployeeAccess() {
        // Uses dbConn

    }
}
