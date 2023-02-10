package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class updatequery {
	public static void main(String[]args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/b15";
		String username="root";
		String password="sHj@6378#jw";
		Connection connection=null;
		String updatequery="update students set department ='Mech' where slno= 2";
		try {
			connection=DriverManager.getConnection(url, username, password);
			System.out.println(" database connection is sucessfull: "+url);
			Statement statement=connection.createStatement();
			ResultSet result=statement.executeQuery(updatequery);
			while(result.next()){
				System.out.println("slno:"+result.getInt(1));
				System.out.println("department:"+result.getString(2));
				System.out.println("age:"+result.getInt(3));
				System.out.println("name:"+result.getString(4));
				System.out.println("fees:"+result.getInt(5));
				System.out.println("data is readed sucessfully");
			}
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			connection.close();
		}
		
	}



	

		
	}


