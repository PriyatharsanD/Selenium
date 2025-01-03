package com.advSelenium.Listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImp implements ITestListener,ISuiteListener{
	public void onTestFailure(ITestResult result) 
	{
		WebDriver driver = AmazonBaseClass.copyDriver;
		TakesScreenshot ss = (TakesScreenshot)driver;
		String testName = result.getMethod().getMethodName();
		String fileName=testName+TimeStamp.getTimeStamp();
		File src = ss.getScreenshotAs(OutputType.FILE);
		try 
		{
			FileHandler.copy(src,new File("./Screenshots/"+fileName+".png"));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}