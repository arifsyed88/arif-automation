package com.automation.facebook.MavenFacebook;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.automation.SauceLabs.SauceLabTest.WebDriverFactory;

public class LeaveComment extends WebDriverFactory {
	
	HomePage homePage = new HomePage();
	NameRejectedPage nameRejectedPage = new NameRejectedPage();
	
	@Test
	public void leaveComment() throws InterruptedException {
		homePage.createInvalidAccount();
		nameRejectedPage.setRatingAndTypeComment();
		
	}

}
