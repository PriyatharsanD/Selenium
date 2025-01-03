package com.webshop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Register")
	private WebElement registerLink;
	
	@FindBy(linkText="Log in")
	private WebElement logInLink;	
	
	@FindAll({@FindBy(className ="ico-logout"),@FindBy(linkText="Log out")})
	private WebElement logOutLink;
	
	@FindBy(xpath = "//a[@class='account']")
	WebElement userId;
	
	public void clickRegister()
	{
		registerLink.click();
	}
	public void clickLogIn()
	{
		logInLink.click();
	}
	public void clickLogOut()
	{
		logOutLink.click();
	}
	public String getUser()
	{
		return userId.getText();
	}
}
