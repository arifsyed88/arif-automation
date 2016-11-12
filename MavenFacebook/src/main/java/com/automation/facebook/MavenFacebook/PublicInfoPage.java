package com.automation.facebook.MavenFacebook;

import org.openqa.selenium.By;

public class PublicInfoPage extends BasePage {
	
	private By publicInfoHeader = By.xpath(".//div[@class='_2jfb' and contains(text(),'What is public information?')]");
	
	public void assertPublicInfoPage() {
		assertEqualsTo(publicInfoHeader, "What is public information?");
	}

}
