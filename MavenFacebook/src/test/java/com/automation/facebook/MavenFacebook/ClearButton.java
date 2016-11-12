package com.automation.facebook.MavenFacebook;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.automation.SauceLabs.SauceLabTest.WebDriverFactory;

public class ClearButton extends WebDriverFactory {

	HomePage homePage = new HomePage();
	DevelopersPage developersPage = new DevelopersPage();
	SuccessStoriesPage successStoriesPage = new SuccessStoriesPage();
	
	@Test
	public void validateClearButton() {
		homePage.clickDevelopersLink();
		developersPage.clickSuccessStoriesLink();
		successStoriesPage.selectAndClearFilter();
	}
	
}
