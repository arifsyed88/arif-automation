package com.automation.facebook.MavenFacebook;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.automation.SauceLabs.SauceLabTest.WebDriverFactory;

public class searchCareers extends WebDriverFactory {

	HomePage homePage = new HomePage();
	CareersPage careersPage = new CareersPage();
	
	@Test
	public void searchAndSelectCareer() {
		homePage.clickCareers();
		careersPage.searchJobsAndSelectLocation();
	}
}
