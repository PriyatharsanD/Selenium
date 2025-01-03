package com.google.genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabaseUtility {
	Connection con;
	public Connection getConnection(String username, String password) throws SQLException
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/priya",username, password);
		return con;
	}
	public ResultSet executeSelectQuery(String query) throws SQLException
	{
		Statement stmt = con.createStatement();
		return stmt.executeQuery(query);
	}
	public int executeInsertQuery(String query) throws SQLException
	{
		Statement stmt = con.createStatement();
		return stmt.executeUpdate(query);
	}
	public void closeDataBase() throws SQLException
	{
		con.close();
	}
}
