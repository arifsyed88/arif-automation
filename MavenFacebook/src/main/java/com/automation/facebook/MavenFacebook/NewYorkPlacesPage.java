package com.automation.facebook.MavenFacebook;

import org.openqa.selenium.By;

public class NewYorkPlacesPage extends BasePage {
	
	private By manhattanLink = By.xpath("//a[contains(text(),'Manhattan')]");
	
	public void clickManhattan() {
		clickOnElement(manhattanLink);
	}
}
