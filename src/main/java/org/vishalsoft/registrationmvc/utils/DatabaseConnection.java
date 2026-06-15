package org.vishalsoft.registrationmvc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/registrationDB";

    private static final String USER = "postgres";

    private static final String PASSWORD = "Vishal@9890";

    public static Connection getConnection() throws SQLException {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
        );
    }
}