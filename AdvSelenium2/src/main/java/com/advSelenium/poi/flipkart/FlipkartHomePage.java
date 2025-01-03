package com.advSelenium.poi.flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartHomePage {
	@FindBy(name="q")
	public WebElement search;
	
	@FindBy(xpath = "//span[text()='Fashion']")
	public WebElement fashion;
	

}
