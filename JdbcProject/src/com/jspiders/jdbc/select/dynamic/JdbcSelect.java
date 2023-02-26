package com.jspiders.jdbc.select.dynamic;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JdbcSelect {

	private static Connection connection;
	private static FileReader filereader;
	private static Properties properties;
	private static String filepath="C:\\WEJE3\\JdbcProject\\db_info.properties";
	private static int result;
	private static String query;
	private static PreparedStatement preparedstatement;
	private static ResultSet resultset;
	
	public static void main(String[] args) {
		try
		{
			filereader = new FileReader(filepath);
			properties = new Properties();
			properties.load(filereader);
			Class.forName(properties.getProperty("driverpath"));
			
			connection = DriverManager.getConnection(properties.getProperty("dburl"),properties);
//			Prepare statement
			query = "select * from emp where empid = ? ";
			preparedstatement = connection.prepareStatement(query);
			
			preparedstatement.setInt(1, 2);
			resultset = preparedstatement.executeQuery();
			while(resultset.next())
			{
			System.out.println(resultset.getString(1)+" | "+resultset.getString(2)+" | "+
			                    resultset.getString(3)+" | "+resultset.getString(4));
			}
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
				if(resultset!=null)
				{
					resultset.close();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	}
}
