package com.automation.facebook.MavenFacebook;

import org.openqa.selenium.By;

public class GamesPage extends BasePage {
	
	private By searchGamesTextBox = By.xpath("//*[@class='_58al']");
	private By soccerStarsLink = By.xpath("//span[contains(text(),'Soccer Stars')]");
	private By battleLink = By.xpath("//*[contains(text(),'Battle')]");
	private By sportsLink = By.linkText("Sports");
	
	public void searchAndClickGame() {
		hoverOverElement(battleLink);
		clickOnElement(sportsLink);
		sendKeysToElement(searchGamesTextBox, "soccer");
		clickOnElement(soccerStarsLink);
	}

}
