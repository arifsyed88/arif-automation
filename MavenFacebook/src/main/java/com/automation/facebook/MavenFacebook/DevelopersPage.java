package com.automation.facebook.MavenFacebook;

import org.openqa.selenium.By;

public class DevelopersPage extends BasePage {

	private By successStoriesLink = By.linkText("Success Stories");
	private By caseStudiesLink = By.linkText("Case Studies");
	
	public void clickSuccessStoriesLink() {
		clickOnElement(caseStudiesLink);
	}
}
