package com.automation.SauceLabs.SauceLabTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SampleTest extends WebDriverFactory {

//	@Test
//	public void sampleTest() throws InterruptedException {
//		getDriver().findElement(By.id("email")).sendKeys("arif");
//		Thread.sleep(5000);
//	}
	
	@Test
	public void sampleTest2() throws InterruptedException {
		getDriver().findElement(By.id("email")).sendKeys("arif");
		Thread.sleep(5000);
	}
}
