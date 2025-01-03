package com.advSelenium.DataDrivenTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ReadFromDBTest {
	@DataProvider(name="dbdata")
	public Object[][] data() throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/priya","root","root");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employee");
		Object[][] data = new Object[4][3];
		int i=0;
		System.out.println(rs.getRow());
		while(rs.next())
		{
			for(int j=0;j<3;j++)
			{
				data[i][j] = rs.getString(j+1);
			}
			i++;
		}
		return data;
	}
	@Test(dataProvider = "dbdata")
	public void test(String id,String name,String salary)
	{
		System.out.println(id+" "+name+" "+salary);
	}

}
