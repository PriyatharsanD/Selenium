package com.webshop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement loginButton;
	
	@FindBy(xpath = "//a[@class='account']")
	WebElement userId;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	public void login(String a, String b)
	{
		email.sendKeys(a);
		password.sendKeys(b);
		loginButton.click();
		
	}
	public String getUser()
	{
		return userId.getText();
	}
}
