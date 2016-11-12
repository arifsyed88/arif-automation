package com.automation.facebook.MavenFacebook;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.automation.SauceLabs.SauceLabTest.WebDriverFactory;

public class SelectSoccerStars extends WebDriverFactory {

	HomePage homePage = new HomePage();
	GamesPage gamesPage = new GamesPage();
	
	@Test
	public void selectSoccerStars() {
		homePage.clickGames();
		gamesPage.searchAndClickGame();
		//game does not load because you are not logged in
	}
}
