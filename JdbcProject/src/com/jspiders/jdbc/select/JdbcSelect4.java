package com.jspiders.jdbc.select;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcSelect4 {
// 3rd way of getting connection(most secure way, credentials are hidden)
	private static Connection connection;
	private static String dburl = "jdbc:mysql://localhost:3306/weje3?user=root&password=root";
	private static String driverpath = "com.mysql.cj.jdbc.Driver";
	private static Statement statement;
	private static String query;
	private static ResultSet resultset;
	private static Properties properties;
	private static FileReader filereader;
	private static String filepath = "C:\\WEJE3\\JdbcProject\\db_info.properties";
	
	public static void main(String[] args) {
//		1)	Loading of driver class
			try {
				Class.forName(driverpath);
			//	2)	Open the connection(2nd way)
				filereader = new FileReader(filepath);
				properties = new Properties();
				properties.load(filereader);
				
				connection = DriverManager.getConnection(dburl, properties);
			//	3)Create statement
				statement = connection.createStatement();
				query="select * from emp";
				resultset = statement.executeQuery(query);
			//	4)Process the result
				while(resultset.next())
				{
					System.out.println("Albert");
					System.out.println(resultset.getString(1)+" ||"+
							resultset.getString(2)+" ||"+
							resultset.getString(3)+" ||"+
							resultset.getString(4));
				}
			}       
			catch (ClassNotFoundException | SQLException | IOException e) {
				e.printStackTrace();
			}
			//	5)Close the connection
			finally {
				try {
					if(connection!=null || statement!= null || resultset!=null||filereader!=null)
					{
					connection.close();
					statement.close();
					resultset.close();
					filereader.close();
					}
				} 

				catch (SQLException | IOException e) {
					e.printStackTrace();
				}

			}
	}
}
