package com.Qa.TestBaseDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ReporterConfig.Property;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() 
	{
		try {
			FileInputStream ip = new FileInputStream("D:\\Yogesh_selenium\\com.fbk\\src\\main\\java\\com\\facebook\\configuration\\config.properties");
			prop = new Properties();
			prop.load(ip);		
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("browser"));
		{
			System.setProperty(prop.getProperty("systemproperty_1"),prop.getProperty("systemproperty_2"));
			driver= new ChromeDriver();
		}
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
}
