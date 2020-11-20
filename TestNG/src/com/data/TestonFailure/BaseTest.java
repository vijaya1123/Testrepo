package com.data.TestonFailure;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		System.setProperty("webdriver.chrome.driver" , "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver" , "C:\\Program Files\\IEDRiver\\IEDriverServer.exe");
		if(driver==null)
		driver = new  ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}
	}

