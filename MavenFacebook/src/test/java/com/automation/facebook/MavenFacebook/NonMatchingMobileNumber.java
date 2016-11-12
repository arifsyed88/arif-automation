package com.automation.facebook.MavenFacebook;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.automation.SauceLabs.SauceLabTest.WebDriverFactory;

public class NonMatchingMobileNumber extends WebDriverFactory {
	
	HomePage homePage = new HomePage();
	
	@Test
	public void nonMatchingMobileNumberError() {
		
		homePage.enterNonMatchingNumber();
	}
	
	

}
