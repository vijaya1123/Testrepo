package com.data.TestonFailure;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.error.Mark;

public class Testcase1 {
	/*
	public ExtentHtmlReporter  htmlreporter;
	public ExtentReporter  extent;
	public ExtentTest  test;
	
	@BeforeTest
	public void beforesetup(){
		htmlReporter = new  ExtentHtmlReporter("/reports/extent.html");
		htmlReporter.config.setEncoding("utf-8");
		htmlReporter.config.setDocumentTitle("W2a automation reports");
		htmlReporter.config.setReportName("Automation Reports");
		htmlReporter.config.setTheme("Theme.STANDARD");
		
		extent= new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSysteminfo("Automation Tester ","vijay sharma");
		extent.setSysteminfo("organisation name ", "cns comnet");	
		extent.setSysteminfo("build no", "UTF-567");

	}
	
	@AfterTest
	public void endReport(){
		extent.flush();
	}
	
	@Test
	public void doUserRegTest(){
		test=extent.createTest("user Reg Test");
		Assert.fail("User Registrtion test Failed");
	}
	@Test
	public void doUserRegTest(){
		test=extent.createTest("skip Test");
		throw new skipException("skipping the test Exception");
	}
	
	@AfterMethod
	public  void tearDown(ITestResult result){
		
		if(result.getStatus()==ITestResult.FAILURE){
			
			
		}else if(result.getStatus()==ITestResult.SKIP){
			
		}
        else if(result.getStatus()==ITestResult.SUCCESS){
        	String methodnm=result.getMethod().getMethodName();
        	String logtext= "<b>"+"TEST CASE"+ methodName.toUpperCase()+ "PASSED";
        	Mark m =MarkHelper.createLabel(logtext, ExtentColor.GREEN);
        	test.pass(m);
			
		}
			
		
		
		
	
	
	
	}
	*/

}
