package com.advSelenium.parallelExecution;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ContactTest extends BaseClass {
	@Test(groups = "smokeTest")
	public void createContact()
	{
		System.out.println("Contact is created");
	}
	@Test(groups="regressionTest")
	public void verifyContact()
	{
		System.out.println("Contact is verified");
	}
	@Test(groups="regressionTest")
	public void deleteContact()
	{
		System.out.println("Contact is deleted");
	}

}
