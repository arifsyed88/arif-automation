package com.automation.facebook.MavenFacebook;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.automation.SauceLabs.SauceLabTest.WebDriverFactory;

public class VerifyManhattan extends WebDriverFactory {
	
	HomePage homePage = new HomePage();
	PlacesPage placesPage = new PlacesPage();
	NewYorkPlacesPage newYorkPlacesPage = new NewYorkPlacesPage();
	ManhattanPage manhattanPage = new ManhattanPage();
	
	@Test
	public void goToManhattanPage() {
		homePage.clickPlaces();
		placesPage.searchAndClickNewYork();
		newYorkPlacesPage.clickManhattan();
//		manhattanPage.assertManhattan(); Not Handling Multiple Windows/Browsers
	}

}
