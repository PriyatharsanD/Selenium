package com.advSelenium.profiling;

import org.testng.annotations.Test;

public class HomePageTest {
	@Test(groups = "smokeSuite")
	public void loginTest()
	{
		System.out.println("Log In");
	}
	@Test(groups="smokeSuite")
	public void logoutTest()
	{
		System.out.println("Log Out");
	}
	@Test(groups = "smokeSuite")
	public void Register()
	{
		System.out.println("Registration");
	}
	@Test(groups = "regressionSuite")
	public void messageTest()
	{
		System.out.println("Message");
	}

}
