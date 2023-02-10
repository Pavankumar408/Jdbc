package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertquery {
	public static void main(String[]args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/b15";
		String username="root";
		String password="sHj@6378#jw";
		Connection connection=null;
		String insertquery="insert into students values(5,'ECE',30,'pavan',20000)";
		try {
			connection =DriverManager.getConnection(url, username, password) ;
			System.out.println("database connection is sucessfull:"+url);
			Statement statement=connection.createStatement();
			statement.executeUpdate(insertquery);
			System.out.println("data is inserted sucessfull");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			connection.close();
		}
		
	}

}
