package com.automation.facebook.MavenFacebook;

import org.openqa.selenium.By;

public class PlacesPage extends BasePage {
	
	private By cityNameTextBox = By.id("u_0_5");
	private By newYorkOption = By.id("js_1");
	
	public void searchAndClickNewYork() {
		sendKeysToElement(cityNameTextBox, "New");
		clickOnElement(newYorkOption);
	}

}
