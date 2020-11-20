package com.data.TestonFailure;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener  extends  BaseTest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			TestUtilScreen.capturescreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext arg0) {
		TestUtilScreen.zip(System.getProperty("user.dir")+"\\screenshot");
		monitoringmail  mail =new monitoringmail();
		
		try{
			mail.send(TestConfig.Server)
		}catch(AddressException e)
		{
			e.prinstacktrace();
			
		}
		catch(MessageException e)
		{
			e.prinstacktrace();
			
		}
		
		
		
		
	
		
	}

}
