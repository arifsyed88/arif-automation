package com.automation.facebook.MavenFacebook;

import org.openqa.selenium.By;

public class TermsPage extends BasePage {
	
	private By termsLike = By.id("u_0_1");
	private By termsShare = By.id("u_0_2");
	private By loginMessage = By.id("content");

	public void clickLikeAndCheckPopUp() throws InterruptedException {
		Thread.sleep(2000);
		clickOnElement(termsShare);
		
	}

}
