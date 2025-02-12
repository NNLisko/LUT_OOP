package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtil {
    static String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
    static String username = "Lisko";
    static String password = "masterchief";
    
    static ResultSet resultset;
    static Connection connection;
    static Statement statement;

    public static void connection() throws ClassNotFoundException {
        try {
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            statement = connection.createStatement();
            resultset = statement.executeQuery("SELECT sno, sname FROM student");

        } catch (SQLException e) {
            System.out.println("sqlException");
        }
    }

    public static void closeConnection() {
        try {
            resultset.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Closing failed.");
        }
    }
}
