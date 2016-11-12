package com.automation.facebook.MavenFacebook;

import org.openqa.selenium.By;

public class HelpPage extends BasePage {
	
	private By helpSearchBox = By.id("hc_search_input");
	private By publicInformation = By.xpath("//li[@title='What is public information?']");
	
	public void searchAndClickPublicInfo() {
		sendKeysToElement(helpSearchBox, "What is public");
		clickOnElement(publicInformation);
	}

	
}
