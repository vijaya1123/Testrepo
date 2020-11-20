package com.data.Dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataproviderTest {
	
	@DataProvider(name="dp1")
	public static Object[][] getData(Method m)
	{
		Object[][] data=null;
		if(m.getName().equals("testlogin")){
			data= new Object[2][2];
			
			data[0][0]="raman";
			data[0][1]="test@gmail.com";
			
			data[1][0]="vijay";
			data[1][1]="test11@gmail.com";
		}else if(m.getName().equals("testUserRegistration"))
		{
			data[0][0]="raman";
			data[0][1]="test@gmail.com";
			data[0][2]="senior";
			
			data[1][0]="vijay";
			data[1][1]="test11@gmail.com";
			data[1][2]="test12@gmail.com";
			
		}
		return data;
	}

}
