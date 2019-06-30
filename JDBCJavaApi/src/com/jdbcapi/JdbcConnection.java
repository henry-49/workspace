package com.jdbcapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnection {

 public static void main(String[] args) throws Exception {
  Class.forName("com.mysql.jdbc.Driver");
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb","root","00000");
  Statement statement = conn.createStatement();
  ResultSet resultSet = statement.executeQuery("SELECT * FROM user"); // INSERT, UPDATE, DELETE, executeUpdate
  while(resultSet.next()) {
   System.out.println("==============================");
   System.out.println(resultSet.getInt("id"));
   System.out.println(resultSet.getString("name"));
   System.out.println(resultSet.getInt("age"));
   System.out.println(resultSet.getString("city"));
  }
 }
}

