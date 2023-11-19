package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sys";
        String username = "root";
        String password = "Arseni34";

        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);

        try ( Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY, name VARCHAR(255))";
            statement.executeUpdate(createTableSQL);

            //create
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (id, name) VALUES (?, ?)");
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "User2");
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement("INSERT INTO users (id, name) VALUES (?, ?)");
            preparedStatement.setInt(1,1);
            preparedStatement.setString(2, "User1");
            preparedStatement.executeUpdate();

            //read
            ResultSet rs = statement.executeQuery("SELECT * from users");
            while (rs.next()){
                System.out.println(rs.getInt("id")+ "  " + rs.getString("name"));
            }

            //update
             preparedStatement = connection.prepareStatement("UPDATE users SET name = ? WHERE id = ?");
            preparedStatement.setString(1, "New User1");
            preparedStatement.setInt(2, 1);
            preparedStatement.executeUpdate();
            System.out.println("Database was updated.");

            //delete
            preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
            preparedStatement.setInt(1, 2);
            preparedStatement.executeUpdate();

            //read again
            rs = statement.executeQuery("SELECT * from users");
            while (rs.next()){
                System.out.println(rs.getInt("id")+ "  " + rs.getString("name"));
            }


            preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
            preparedStatement.setInt(1, 1);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}