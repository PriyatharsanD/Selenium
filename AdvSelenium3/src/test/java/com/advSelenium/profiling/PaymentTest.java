package com.advSelenium.profiling;

import org.testng.annotations.Test;

public class PaymentTest {
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
