package com.wlabs.parkoo.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @licence MIT Licence
 * @author Wilfried AGO
 * @email wilfriedago@pm.me
 */
public class ConnectionDB {

    private static final String URL = "jdbc:postgresql://localhost:5432/parkooDB";
    private static final String USER = "postgres";
    private static final String PASSWD = "welcome1234";
    protected static Connection connection;

    public static Connection getInstance() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWD);
                System.out.println("Sucessfully connected to the database !");
            } catch (SQLException e) {
                System.out.println("Unable to connect to the database !");
            }
        }
        return connection;
    }
}
