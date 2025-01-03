package com.jenkinSample;

import org.testng.annotations.Test;

public class LogInPageTest {
	@Test(groups = "regressionSuite")
	public void pay()
	{
		System.out.println("Payment");
	}
	@Test(groups = "regressionSuite")
	public void cancel()
	{
		System.out.println("Cancel");
	}
	@Test(groups = "smokeSuite")
	public void upi()
	{
		System.out.println("UPI");
	}


}
