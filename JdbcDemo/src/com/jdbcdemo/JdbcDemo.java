package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getConnection();
	}
	public static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/firstdb";
			String username = "root";
			String password = "00000";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM user");
			System.out.println("connected.....");
			while (rs.next()) {
				
				System.out.println("ID-> "+rs.getInt("id"));
				System.out.println("Name-> "+rs.getString("name"));
				System.out.println("Age-> "+rs.getInt("age"));
				System.out.println("City-> "+rs.getString("city"));
				System.out.println("============================");
			}
			return con;
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
		
	}
}
