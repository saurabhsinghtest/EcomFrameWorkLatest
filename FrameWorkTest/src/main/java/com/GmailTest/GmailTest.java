package com.GmailTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Core.FunctionLibraries;



public class GmailTest extends FunctionLibraries {

	@Test
	public void verifyGmailTestOnChrome() {
		 
		startBrowser();
		
	}
	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
		getDriver().close();
	}

}
