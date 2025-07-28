package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class App {
  // url, username and password required to connect to db
  private static final String url = "jdbc:oracle:thin:@//bose:1521/FREE";
  private static final String username = "system";
  private static final String password = "sayanbose123";

  public static void main(String[] args) {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver"); // loads the jdbc driver into memory
    } catch (ClassNotFoundException cnfe) { // Class.forName may return ClassNotFoundException
      System.out.println(cnfe.getMessage());
    }

    try {
      Connection connection = DriverManager.getConnection(url, username, password); // establishes connection with db
      String query1 = "insert into Students values (?, ? , ?, ?)"; // ? are placeholders, value can be added later
      Scanner sc = new Scanner(System.in);

      PreparedStatement ps = connection.prepareStatement(query1);

      while (true) {
        System.out.print("Enter id: ");
        int id = sc.nextInt();

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        // Setting the ? placeholder values in prepared statement
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, age);
        ps.setDouble(4, marks);

        ps.addBatch(); // queues the rows for sending them together later

        System.out.print("Want to add more data? (Y/N): ");
        String choice = sc.next();

        if (choice.toLowerCase().equals("n"))
          break;
      }

      int[] arr = ps.executeBatch(); // sends all the rows together. Returns passing array. Eg:- [1 0 0 1] (where 1- pass, 0- fail)

      System.out.print("Array: ");
      for (int i : arr) {
        System.out.print(i + " ");
      }
      System.out.println();

      String query2 = "select * from Students";
      PreparedStatement selectPS = connection.prepareStatement(query2);

      ResultSet rs = selectPS.executeQuery();

      while (rs.next()) { // rs.next() returns true if new values present, false otherwise
        System.out.print(rs.getInt("id") + "  ");
        System.out.print(rs.getString("name") + "  ");
        System.out.print(rs.getInt("age") + "  ");
        System.out.print(rs.getDouble("marks") + "  ");

        System.out.println();
      }

      sc.close();
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }

  }
}
