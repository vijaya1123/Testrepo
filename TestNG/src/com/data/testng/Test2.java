package com.data.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
	@BeforeSuite
	public void test1(){
		System.out.println("in Before Suite");
	}
	@BeforeTest
	public void test2(){
		System.out.println("in Before test");
	}
	@BeforeClass
	public void test3(){
		System.out.println("in Before Class");
	}
	@Test
	public void testlog(){
		System.out.println("in  test cases");
	}
	@AfterTest
	public void  test4(){
		System.out.println("in  After Test");
	}
	@AfterClass
	public void test5(){
		System.out.println("in After class");
	}
	@AfterSuite
	public void test6(){
		System.out.println("in After Suite");
	}
}
	/*@Test
	public void testlog(){
		System.out.println("in test login");
	}
	@Test
	public void testlog(){
		System.out.println("in test login");
	}
	@Test
	public void testlog(){
		System.out.println("in test login");
	}
	@Test
	public void testlog(){
		System.out.println("in test login");
	}
	@Test
	public void testlog(){
		System.out.println("in test login");
	}
	*/



