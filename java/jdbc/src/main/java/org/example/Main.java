package org.example;

import java.sql.*;

class Main {
    private static final String url = "jdbc:oracle:thin:@//bose:1521/FREE";
    private static final String username = "system";
    private static final String password = "sayanbose123";

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // loading the driver in runtime
        } catch (ClassNotFoundException cnfe) {
            System.out.println(cnfe.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            //  Statement statement = connection.createStatement(); // Using normal statements

            String query1 = "insert into Students values (?, ?, ?, ?)"; // this gets precompiled. '?' values are added later
            PreparedStatement preparedStatement = connection.prepareStatement(query1);
            preparedStatement.setInt(1, 39998); // 1 is 1st pos, 2 is 2nd pos and so on
            preparedStatement.setString(2, "Biju");
            preparedStatement.setInt(3, 85);
            preparedStatement.setDouble(4, 36.33);

            int noOfRowsAffected = preparedStatement.executeUpdate();

            System.out.println("No of rows affected: " + noOfRowsAffected);

            String query2 = "select * from Students";
            PreparedStatement selectStatement = connection.prepareStatement(query2);
            ResultSet resultSet = selectStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");

                System.out.print("Id: " + id + " | ");
                System.out.print("Name: " + name + " | ");
                System.out.print("Age: " + age + " | ");
                System.out.print("Marks: " + marks + " | ");
                System.out.println();
            }

        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}