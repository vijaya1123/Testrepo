package com.data.regression;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	
	@BeforeSuite
	public void setUp(){
		System.out.println("initialising everthing");
	}
	
	@AfterSuite
	public void tearDown(){
		System.out.println("quiting everthing");
	}


}
