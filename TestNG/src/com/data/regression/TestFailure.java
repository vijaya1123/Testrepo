package com.data.regression;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure extends BaseTest{
	
	@Test
	public void doLogin(){
	
		Assert.fail("in fail test");
		System.out.println("in fail test");
	}

}
