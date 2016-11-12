package com.automation.facebook.MavenFacebook;

import org.openqa.selenium.By;

public class SuccessStoriesPage extends BasePage {
	
	private By regionDropDown = By.linkText("Region");
	private By industryDropDown = By.id("u_0_5");
	private By productDropDown = By.id("u_0_8");
	private By asiaSelection = By.xpath(".//*[@id='u_0_0']/div/ul/li[1]/a");
	private By industrySelection = By.xpath(".//*[@id='u_0_3']/div/ul/li[1]/a");
	private By productSelection = By.xpath(".//*[@id='u_0_6']/div/ul/li[5]/a");
	private By clearButton = By.linkText("Clear");
	
	
	public void selectAndClearFilter() {
		clickOnElement(regionDropDown);
		clickOnElement(asiaSelection);
		clickOnElement(industryDropDown);
		clickOnElement(industrySelection);
		clickOnElement(productDropDown);
		clickOnElement(productSelection);
		clickOnElement(clearButton);
		
	}

}
