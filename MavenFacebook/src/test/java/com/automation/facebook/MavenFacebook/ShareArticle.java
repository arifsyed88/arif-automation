package com.automation.facebook.MavenFacebook;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.automation.SauceLabs.SauceLabTest.WebDriverFactory;

public class ShareArticle extends WebDriverFactory {

	HomePage homePage = new HomePage();
	AdsChoicesPage adsChoicesPage = new AdsChoicesPage();
	
	@Test
	public void assertShareArticleError() {
		homePage.clickAdsChoice();
		adsChoicesPage.clickShareArticle();
	}
}
