package com.advSelenium.extentReport;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class AmazonHomePage extends BaseClass {
	@Test
	public void loginTest()
	{
		ExtentTest test = reports.createTest("Login Test");
		test.log(Status.INFO, "UN and Password is Collected");
		test.log(Status.PASS,"Verification is success");
	}
	@Test
	public void logOutTest()
	{
		ExtentTest test = reports.createTest("Logout Test");
		test.log(Status.PASS,"Logout is success");
	}
	@Test
	public void registerTest()
	{
		ExtentTest test = reports.createTest("Register Test");
		test.log(Status.INFO,"Name is entered");
		test.log(Status.INFO, "Age is entered");
		test.log(Status.INFO,"Address is enered");
		test.log(Status.WARNING,"Password is not strong");
		test.log(Status.WARNING, "Alternative contact number is not entered");
		test.log(Status.PASS,"Email is verified");
	}

}
