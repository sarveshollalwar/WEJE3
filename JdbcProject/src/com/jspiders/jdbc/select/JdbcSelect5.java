package com.jspiders.jdbc.select;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcSelect5 {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultset;
	private static String query;
	private static String filepath="C:\\WEJE3\\JdbcProject\\db_info.properties";
	private static FileReader filereader;
	private static Properties properties;

	public static void main(String[] args) {
		try {
			filereader = new FileReader(filepath);
			properties = new Properties();
			properties.load(filereader);
			
			Class.forName(properties.getProperty("driverpath"));
			
			connection = DriverManager.getConnection(properties.getProperty("dburl"),properties);
			
			statement = connection.createStatement();
			query = "select * from emp";
			resultset = statement.executeQuery(query);
			
			while(resultset.next())
			{
				System.out.println("himanshu shah");
				System.out.println(resultset.getString(1)+" ||"+
							resultset.getString(2)+" ||"+
							resultset.getString(3)+" ||"+
							resultset.getString(4));
			}
		}
		catch (IOException | ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		finally {
			try {
				if(connection!=null)
				{
					connection.close();
				}
				if(statement!=null)
				{
					statement.close();
				}
				if(resultset!=null)
				{
					resultset.close();
				}
				if(filereader!=null)
				{
					filereader.close();
				}
			}
			catch(SQLException | IOException e)
			{
				e.printStackTrace();
			}
		}
	}



}
