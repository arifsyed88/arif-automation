package com.automation.facebook.MavenFacebook;

import org.openqa.selenium.By;

public class AboutPage extends BasePage {

	private By notesLink = By.linkText("Notes");
	
	public void clickNotes() {
		clickOnElement(notesLink);
	}
}
