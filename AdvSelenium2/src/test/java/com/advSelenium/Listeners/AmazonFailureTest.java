package com.advSelenium.Listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImp.class)
public class AmazonFailureTest extends AmazonBaseClass{
	
	@Test
	public void homePage()
	{
		String expName="field-keyword";
		driver.get("https://www.amazon.in/home/");
		String actName=driver.findElement(By.id("twotabsearchtextbox")).getAttribute("name");
		Assert.assertEquals(actName,expName);
	}
}
