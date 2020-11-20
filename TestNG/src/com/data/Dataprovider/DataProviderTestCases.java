package com.data.Dataprovider;

import org.testng.annotations.Test;

public class DataProviderTestCases {
	
	@Test(dataProviderClass=DataproviderTest.class ,dataProvider="dp1")
	public void doLogin(String usernm  , String pass){
		System.out.println("usernm" +"pass");
		
		
		
	}
	
	@Test(dataProviderClass=DataproviderTest.class ,dataProvider="dp1")
	public void dodUserRegistration(String usernm  , String pass, String Desg){
		
		System.out.println("usernm" +"pass"+ "Desg");
		
		
		
	}
	

}
