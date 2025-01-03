package com.webshop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({@FindBy(name="Gender"),@FindBy(id="gender-male")})
	public WebElement male;
	
	@FindBy(id="gender-female")
	public WebElement female;
	
	@FindBy(id="FirstName")
	public WebElement firstName;
	
	@FindBy(id="LastName")
	public WebElement lastName;
	
	@FindBy(id="Email")
	public WebElement email;
	
	@FindBy(id="Password")
	public WebElement password;
	
	@FindBy(id="ConfirmPassword")
	public WebElement confirmPassword;
	
	@FindBy(id="register-button")
	public WebElement registerButton;
}