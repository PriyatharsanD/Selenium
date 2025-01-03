package com.advSelenium.ConfigAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	@BeforeSuite
	public void dbConfig()
	{
		System.out.println("Config DB");
	}
	@BeforeClass
	public  void configBrowser()
	{
		System.out.println("Launch Browser");
	}
	@BeforeMethod
	public void logIn()
	{
		System.out.println("Log In");
	}
	@AfterMethod
	public void logOut()
	{
		System.out.println("Log Out");
	}
	@AfterClass
	public  void closeBrowser()
	{
		System.out.println("Close Browser");
	}
	@AfterSuite
	public void close()
	{
		System.out.println("Close DB and take backup report");
	}
}
