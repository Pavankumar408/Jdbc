package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.exceptions.ConnectionIsClosedException;

public class connectionDb {
	public static void main(String[]args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/b15";
		String username="root";
		String password="sHj@6378#jw";
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("database connection is successfull:"+url);
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			connection.close();
		}
		
		
	}

}
