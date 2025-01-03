package com.advSelenium.parallelExecution;

import org.testng.annotations.Test;

import com.advSelenium.poi.amazon.AmazonHomePage;


public class AmazonSearchTest extends ConfigClass{
	@Test
	public void searchTest()
	{
		AmazonHomePage homePage = new AmazonHomePage(driver);
		homePage.search.sendKeys("iphone");
		homePage.search.submit();
	}

}
