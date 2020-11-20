package com.data.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestDependsonmethods {
	//alwaysrun=true soft dependencies
	
	@Test(priority=1)
	public void doUser(){
		System.out.println("in user registration test");
		//System.setProperty("webdriver.chrome.driver" , "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver" , "C:\\Program Files\\IEDRiver\\IEDriverServer.exe");
		//WebDriver driver = new  ChromeDriver();
		//driver.get("http://www.google.com");
		//String title= driver.getTitle();
		//Assert.fail("user not registered successfully");
	}
	
	@Test(priority=2, dependsOnMethods="doUser" ,alwaysRun=true)
	public void doLogin(){
		System.out.println("in do login test");
	}
	
	@Test(priority=3 , groups="functional")
	public void test3(){
		System.out.println("in test3");
	}
	
	@Test(priority=4 , groups="smoke")
	public void test4(){
		System.out.println("in test4");
	}
	
	



}
