package com.automation.facebook.MavenFacebook;

import org.openqa.selenium.By;

public class NameRejectedPage extends BasePage {
	
	private By excellentRating = By.xpath(".//*[@id='u_0_15']/div");
	private By leaveCommentTextBox = By.xpath("//textarea[@class='uiTextareaNoResize uiTextareaAutogrow _sk7']");
	private By submitButton = By.xpath("//div[@class='_41y']/button[@type='submit']");
	
	public void setRatingAndTypeComment() throws InterruptedException {
		clickOnElement(excellentRating);
		sendKeysToElement(leaveCommentTextBox, "No Comment");
		Thread.sleep(3000);
		clickOnElement(submitButton);
	}
}
