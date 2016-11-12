package com.automation.facebook.MavenFacebook;

import org.openqa.selenium.By;

public class CareersPage extends BasePage {

	private By careersSearchTextBox = By.id("u_0_8");
	private By locationDropDown = By.id("u_0_b");
	private By locationNewYork = By.xpath("//*[@id='u_0_9']/div/div/div[1]/div/div/ul/li[44]/a/span/span");
	
	public void searchJobsAndSelectLocation() {
		sendKeysToElement(careersSearchTextBox, "Software Engineer");
		clickOnElement(locationDropDown);
		clickOnElement(locationNewYork);
	}
}
