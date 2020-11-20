package com.data.regression;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Testskip {
	
	
	@Test
	public void isskip(){
		throw new SkipException("forecefully skipping the test as the condition is not met ");
	}

}
