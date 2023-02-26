package com.jspiders.jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect3 {
// Second way of getting a connection(passing user and password differently than dburl)
	private static Connection connection;
	private static String dburl = "jdbc:mysql://localhost:3306/weje3?user=root&password=root";
	private static String driverpath = "com.mysql.cj.jdbc.Driver";
	private static Statement statement;
	private static String query;
	private static ResultSet resultset;
	private static String user = "root";
	private static String password = "root"; 
	
	public static void main(String[] args) {
//		1)	Loading of driver class
			try {
				Class.forName(driverpath);
			//	2)	Open the connection(2nd way)
				connection = DriverManager.getConnection(dburl,user,password);
			//	3)Create statement
				statement = connection.createStatement();
				query="select * from emp";
				resultset = statement.executeQuery(query);
			//	4)Process the result
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
			//	5)Close the connection
			finally {
				try {
					if(connection!=null || statement!= null || resultset!=null)
					{
					connection.close();
					statement.close();
					resultset.close();
					}
				} 

				catch (SQLException e) {
					e.printStackTrace();
				}

			}
	}
}
