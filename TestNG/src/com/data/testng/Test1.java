package com.data.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver;
	//@BeforeMethod
	@Test
	public void setUP(){
		System.out.println("in set up");
		/*System.setProperty("webdriver.chrome.driver" , "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver" , "C:\\Program Files\\IEDRiver\\IEDriverServer.exe");
		WebDriver driver = new  ChromeDriver();
		//System.setProperty("webdriver.gecko.driver" , "C:\\Program Files\\SeleniumGeckoDriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("http://www.google.com");
*/
}

/*@Test(priority=2)
public void verifyPageTitleTest(){
	String title=driver.getTitle();
	System.out.println("title of the page"+title);
	Assert.assertEquals(title, "Google", "title is not matched");	
	
}

 /*@Test
public void  googleLogoTest(){
	boolean b = driver.findElement(By.xpath(".//*[@id='hplogo']/a/img")).isDisplayed();
	Assert.assertTrue(b);
	Assert.assertEquals(b, true);
}
*/

/*@AfterMethod
public void tearDown(){
	driver.quit();
}
*/
	
	
	

	
	
	

}
