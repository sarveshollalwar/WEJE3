package com.jspiders.jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect1 {
	public static void main(String[] args) {
		try {
//			1) LOADING OF DRIVER CLASS
			Class.forName("com.mysql.cj.jdbc.Driver");

//          2) OPEN THE CONNECTION
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje3?user=root&password=root");
            
//			3) CREATE STATEMENT / PREPARE STATEMENT
			Statement statement = connection.createStatement();
			  
			ResultSet resultset = statement.executeQuery("select * from emp");
			
//			4) PROCESS THE RESULT
			while(resultset.next())
			{
				System.out.println(resultset.getInt(1)+" || "
						           +resultset.getString(2)+" || "
						           +resultset.getString(3)+" || "
						           +resultset.getString(4));
			}
			
			
			

		}
		catch (ClassNotFoundException e) {
			e.printStackTrace(); }
		catch (SQLException e) {
			e.printStackTrace();}
		
		
		

	}
}
