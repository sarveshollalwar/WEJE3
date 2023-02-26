package com.jspiders.jdbc.select;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcInsert {

	private static Connection connection;
	private static Statement statement;
	private static FileReader filereader;
	private static Properties properties;
	private static String query;
	private static int result;
	private static String filepath="C:\\WEJE3\\JdbcProject\\db_info.properties";
	
	public static void main(String[] args) {
		try {
			filereader = new FileReader(filepath);
			properties = new Properties();
			properties.load(filereader);
			
			Class.forName(properties.getProperty("driverpath"));
			connection = DriverManager.getConnection(properties.getProperty("dburl"),properties);
			statement = connection.createStatement();
			query="insert into emp values(3,'Vipul','vipul@gmail.com','Sr. developer')";
			result = statement.executeUpdate(query);
			
			System.out.println("Query ok "+result+" rows affected");
			
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
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
