package com.data.invocationcount;

import org.junit.Test;

public class TestInvocation extends BaseTest {
	
	//5 times test gets executed
	//threadpolsize=5 all 5 instanes of chrome browser will launch

	@Test(invocationCount=5 threadpoolsize=5)
	public void executetest(){
		
		System.out.println("execute test");
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
