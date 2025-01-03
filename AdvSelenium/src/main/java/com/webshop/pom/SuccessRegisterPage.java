package com.webshop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessRegisterPage {
	public SuccessRegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Log out")
	private WebElement logOutLink;
	
	public void clickLogOut()
	{
		logOutLink.click();
	}
}