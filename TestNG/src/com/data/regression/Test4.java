package com.data.regression;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4  extends BaseTest{
	
	@Test(priority=1,groups={"functional","smoke"})
	public void  test1(){
		System.out.println("in Test4 functional regression Test");
	}
	
	@Test(priority=2, groups="bvt")
	public void  test2(){
		System.out.println("in Test 4 bvt regression Test");
	}
	
}




