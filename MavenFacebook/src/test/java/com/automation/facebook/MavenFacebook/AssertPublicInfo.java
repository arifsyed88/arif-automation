package com.automation.facebook.MavenFacebook;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.automation.SauceLabs.SauceLabTest.WebDriverFactory;

public class AssertPublicInfo extends WebDriverFactory {

	HomePage homePage = new HomePage();
	HelpPage helpPage = new HelpPage();
	PublicInfoPage publicInfoPage = new PublicInfoPage();
	
	@Test
	public void assertPublicInfo() {
		homePage.clickHelp();
		helpPage.searchAndClickPublicInfo();
		publicInfoPage.assertPublicInfoPage();
	}
}
