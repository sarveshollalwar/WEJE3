package com.jspiders.jdbc.select.dynamic;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JdbcInsert {

	private static Connection connection;
	private static FileReader filereader;
	private static Properties properties;
	private static String filepath="C:\\WEJE3\\JdbcProject\\db_info.properties";
	private static int result;
	private static String query;
	private static PreparedStatement preparedstatement;

	public static void main(String[] args) {

		try
		{
			filereader = new FileReader(filepath);
			properties = new Properties();
			properties.load(filereader);
			Class.forName(properties.getProperty("driverpath"));
			
			connection = DriverManager.getConnection(properties.getProperty("dburl"),properties);
//			Prepare statement
			query = "insert into emp values(?,?,?,?)";
			preparedstatement = connection.prepareStatement(query);
			
			preparedstatement.setInt(1, 4);
			preparedstatement.setString(2, "Amol");
			preparedstatement.setString(3, "Amol@google.com");
			preparedstatement.setString(4, "Project Manager");
			
			result = preparedstatement.executeUpdate();
			
			System.out.println("Query ok "+result+" rows affected");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(connection!=null)
				{
					connection.close();
				}
				if(filereader!=null)
				{
					filereader.close();
				}
				if(preparedstatement!=null)
				{
					preparedstatement.close();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
