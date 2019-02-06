package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Qa.TestBaseDemo.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id="email")
	WebElement userEmail;
	@FindBy(id="pass")
	WebElement userPass;
	
	@FindBy(id="loginButton")
	WebElement login;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String VerifyTitle()
	{
		return driver.getTitle();
	}
	
	public void verifylogin()
	{
		userEmail.sendKeys(prop.getProperty("username"));
		userPass.sendKeys(prop.getProperty("password"));
		login.click();
	}
	
}
