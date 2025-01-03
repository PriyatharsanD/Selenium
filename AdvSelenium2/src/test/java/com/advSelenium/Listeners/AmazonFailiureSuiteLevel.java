package com.advSelenium.Listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonFailiureSuiteLevel extends AmazonBaseClass {
	@Test
	public void homePage()
	{
		String expName="field-keyword";
		driver.get("https://www.amazon.in/home/");
		String actName=driver.findElement(By.id("twotabsearchtextbox")).getAttribute("name");
		Assert.assertEquals(actName,expName);
	}
}
