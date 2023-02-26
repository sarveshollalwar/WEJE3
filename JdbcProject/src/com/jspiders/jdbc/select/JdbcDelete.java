package com.jspiders.jdbc.select;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcDelete {

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
			query=" delete from emp where empid = 3";
			result = statement.executeUpdate(query);
			System.out.println("deleting");
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
