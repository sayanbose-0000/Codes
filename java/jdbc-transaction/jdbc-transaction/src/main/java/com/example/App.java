package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class App {
  private static final String url = "jdbc:oracle:thin:@//bose:1521/FREE";
  private static final String username = "system";
  private static final String password = "sayanbose123";

  public static void main(String[] args) {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
    } catch (ClassNotFoundException cnfe) {
      System.out.println(cnfe.getMessage());
    }

    try {
      Connection connection = DriverManager.getConnection(url, username, password);
      connection.setAutoCommit(false); // prevents auto-commiting, we need to commit explicitly
      Scanner sc = new Scanner(System.in);

      String query1 = "update Accounts set balance = balance - ? where accno = ?";
      PreparedStatement ps1 = connection.prepareStatement(query1);

      String query2 = "update Accounts set balance = balance + ? where accno = ?";
      PreparedStatement ps2 = connection.prepareStatement(query2);

      System.out.print("Send from: ");
      int acc1 = sc.nextInt();
      System.out.print("Send to: ");
      int acc2 = sc.nextInt();
      System.out.print("Money: ");
      double money = sc.nextDouble();

      ps1.setDouble(1, money);
      ps1.setInt(2, acc1);

      ps2.setDouble(1, money);
      ps2.setInt(2, acc2);

      ps1.executeUpdate();
      ps2.executeUpdate();

      if (!hasBalance(connection, acc1, acc2, money)) {
        connection.rollback();
        System.out.println("Err! Rolled Back");
      } else {
        System.out.println("Transaction Sucessful!");
        connection.commit();
      }

      sc.close();
    } catch (SQLException sqle) {
      System.out.println(sqle.getMessage());
    }

  }

  static boolean hasBalance(Connection connection, int acc1, int acc2, double money) {
    if (money < 0)
      return false;

    try {
      String query1 = "select balance from Accounts where accno = ?";
      PreparedStatement ps1 = connection.prepareStatement(query1);
      ps1.setInt(1, acc1);
      ResultSet rs1 = ps1.executeQuery();

      if (!rs1.next() || rs1.getDouble("balance") < money) {
        return false;
      }

      String query2 = "select balance from Accounts where accno = ?";
      PreparedStatement ps2 = connection.prepareStatement(query2);
      ps2.setInt(1, acc2);
      ResultSet rs2 = ps2.executeQuery();
      if (!rs2.next() || rs2.getDouble("balance") < 0) {
        return false;
      }

      return true;

    } catch (SQLException sqle) {
      System.out.println(sqle.getMessage());
      return false;
    }
  }
}