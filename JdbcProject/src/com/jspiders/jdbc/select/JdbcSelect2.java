package com.jspiders.jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect2 {
	//	STANDARDIZING THE CODE
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultset;

	public static void main(String[] args) {
		//	1)	Loading of driver class
	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		//	2)	Open the connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje3?user=root&password=root");
//		    3)Create statement
			statement = connection.createStatement();
			resultset = statement.executeQuery("select * from emp");
//			4)Process the result
			while(resultset.next())
			{
				System.out.println(resultset.getString(1)+" ||"+
			                       resultset.getString(2)+" ||"+
						           resultset.getString(3)+" ||"+
			                       resultset.getString(4));
			}
		}       
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
//	        5)Close the connection
	    finally {
	              try {
					connection.close();
					statement.close();
		            resultset.close();
				  } 
	              
	              catch (SQLException e) {
						e.printStackTrace();
					}
	              
	      }

	}
}
