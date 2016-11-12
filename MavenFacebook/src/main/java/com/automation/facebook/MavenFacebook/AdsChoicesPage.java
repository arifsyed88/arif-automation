package com.automation.facebook.MavenFacebook;

import org.openqa.selenium.By;

public class AdsChoicesPage extends BasePage {
	
	private By shareArticleLink = By.linkText("Share Article");
	private By shareArticleErrorMessage = By.xpath("//*[@class='dialog_body']");
	
	public void clickShareArticle() {
		clickOnElement(shareArticleLink);
		assertEqualsTo(shareArticleErrorMessage, "Please log in to continue.");
	}

}
