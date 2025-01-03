package com.advSelenium.poi.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	public AmazonHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement search;
	
	@FindBy(xpath = "//a[contains(text(),'Gift Cards')]")
	public WebElement giftCardsLink;
}
