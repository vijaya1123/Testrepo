package com.data.TestonFailure;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test
	public void doLogin(){
		
		driver.findElement(By.id("Email1")).sendKeys("vijaympct03@gmail.com");
		driver.findElement(By.id("Next")).click();
		//driver.findElement(By.name("login")).click();
	}

}
