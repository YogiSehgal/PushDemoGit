package com.fbk.Testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Qa.TestBaseDemo.TestBase;
import com.facebook.pages.LoginPage;

public class LoginPagetest extends TestBase{

	LoginPage oo;
	String Title;
	String ExpectedTitle="Facebook – log in or sign up";
	public LoginPagetest()
	{
		super();
		
	}
	
	@BeforeSuite
	public void Launch()
	{
		
		initialization();
		oo=new LoginPage();
	}
	@Test
	public void CheckTitle()
	{
		Title=oo.VerifyTitle();
		SoftAssert assr= new SoftAssert();
		assr.assertEquals(ExpectedTitle, Title);
		System.out.println("hello");
		System.out.println("Title:"+ Title);
		assr.assertAll();
	}
	@Test
	public void Loginnnn()
	{
		oo.verifylogin();
	}
	
//	@AfterSuite
//	public void close()
//	{
//		driver.close();
//	}
}
