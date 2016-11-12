package com.automation.facebook.MavenFacebook;

import org.openqa.selenium.By;

public class ManhattanPage extends BasePage {
	
	private By placesInManhattanPageMessage = By.linkText("Places in Manhattan, New York");
	
	public void assertManhattan() {
		assertEqualsTo(placesInManhattanPageMessage, "Places in Manhattan, New York");
	}

}
