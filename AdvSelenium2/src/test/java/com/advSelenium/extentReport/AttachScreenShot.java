package com.advSelenium.extentReport;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class AttachScreenShot extends ScreenshotBaseClass{
	@Test
	public void homePage()
	{
		UtilityObjectThread.getDriver().get("https://www.amazon.in/home");
		UtilityObjectThread.getTest().log(Status.INFO,"Browser is launched");
		UtilityObjectThread.getTest().log(Status.PASS,"Title is verified");
		Assert.assertEquals(false,true);
	}
	@Test
	public void registerTest()
	{
		UtilityObjectThread.getTest().log(Status.INFO,"Name is entered");
		UtilityObjectThread.getTest().log(Status.INFO, "Age is entered");
		UtilityObjectThread.getTest().log(Status.INFO,"Address is enered");
		UtilityObjectThread.getTest().log(Status.WARNING,"Password is not strong");
		UtilityObjectThread.getTest().log(Status.WARNING, "Alternative contact number is not entered");
		UtilityObjectThread.getTest().log(Status.PASS,"Email is verified");
	}
	

}
