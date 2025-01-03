package com.advSelenium.parallelExecution;

import org.testng.annotations.Test;

import com.advSelenium.poi.amazon.AmazonHomePage;

public class AmazonGIfCardTest extends ConfigClass{
	@Test
	public void giftCardTest()
	{
		AmazonHomePage homePage = new AmazonHomePage(driver);
		driverUtility.hover(driver,homePage.giftCardsLink);
	}

}
