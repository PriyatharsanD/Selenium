package com.advSelenium.parallelExecution;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass{
	@BeforeTest(groups = {"smokeTest","regressionTest"})
	public void dbConfig()
	{
		System.out.println("Data Base is configured");
	}
	@AfterTest(groups= {"smokeTest","regressionTest"})
	public void dbClose()
	{
		System.out.println("DB is closed");
	}
//	@BeforeClass(groups= {"smokeTest","regressionTest"})
//	public void launchBrowser()
//	{
//		System.out.println("Launch Browser");
//	}
//	@AfterClass(groups= {"smokeTest","regressionTest"})
//	public void closeBrowser()
//	{
//		System.out.println("Close Browser");
//	}
//	@BeforeMethod(groups= {"smokeTest","regressionTest"})
//	public void logIn()
//	{
//		System.out.println("Log In");
//	}
//	@AfterMethod(groups= {"smokeTest","regressionTest"})
//	public void logOut()
//	{
//		System.out.println("Log Out");
//	}
}
