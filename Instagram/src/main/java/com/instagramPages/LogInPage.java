package com.instagramPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement userNameField;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement logInButton;
	
	public void setUsername(String userName)
	{
		userNameField.sendKeys(userName);
	}
	public void setPassword(String password)
	{
		passwordField.sendKeys(password);
	}
	public void  clickLogIn()
	{
		logInButton.click();
	}
}