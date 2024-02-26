package com.example.demo.designpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonDesignPattern {

}


class DatabaseConnection {
    private static Connection connection;
    static {
        String url = "jdbc:mysql://localhost:3306/sampledb";
        String userName = "root";
        String password = "password";
        try {
            connection = DriverManager.getConnection(url,userName,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}