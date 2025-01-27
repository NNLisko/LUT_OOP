package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtil {
    String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
    String username = "Lisko";
    String password = "masterchief";
    
    public void connection() throws ClassNotFoundException
    {
        Class.forName("org.postgresql.Driver");

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            
            Statement statement = connection.createStatement();

            ResultSet resultset = statement.executeQuery("SELECT * FROM student");

            resultset.close();
            statement.close(); 
            
            connection.close();

        } catch (SQLException e) {
            System.out.println("sqlException");
        }
    }


}
