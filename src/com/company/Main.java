package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException{
	// write your code here
        String url = "jdbc:mysql://localhost:3306/namdb";
        String username = "root";
        String password = "Abcdef12@";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            System.out.println("Connected to the database");
            String sql = "INSERT INTO cusomer (firstname, lastname) VALUES";

            preparedStatement statement = (preparedStatement) connection.prepareStatement(sql);
            statement.setString;
            statement.setString(2, "Pramodya");
            
            int rows = statement.executeUpdate();
            if(rows>0){
                System.out.println("a row has been inserted");
            }
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            System.out.println("OOps, error!");
            throwables.printStackTrace();
        }

    }

    private static class preparedStatement {
    }
}
