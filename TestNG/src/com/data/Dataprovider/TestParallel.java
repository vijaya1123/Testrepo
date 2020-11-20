package com.data.Dataprovider;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParallel {
	
	
	
	@Parameters({"browser"})
	@Test()
	public void doLogin(String b) throws InterruptedException
	{
		
		Date d =new Date();
		System.out.println("browser name"+"---"+b+"----"+d);
		Thread.sleep(2000);
	}

}
