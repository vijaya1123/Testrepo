package com.data.Dataprovider;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParallelDataprovider {
	
	
	//@Parameters({"browser"})
	@Test(dataProvider="getData")
	public void doLogin1(String b) throws InterruptedException
	{
		
		Date d =new Date();
		System.out.println("browser name"+"---"+b+"----"+d);
		Thread.sleep(2000);
	}
	
	@DataProvider(parallel=true)
	public Object[][] getData(){
		
		Object[][]data = new Object[2][1];
		data[0][0]="chrome";
		data[1][0]="firefox";
		
		return data;
	}

	

}
