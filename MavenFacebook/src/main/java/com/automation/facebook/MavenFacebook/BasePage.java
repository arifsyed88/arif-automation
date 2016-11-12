package com.automation.facebook.MavenFacebook;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.automation.SauceLabs.SauceLabTest.WebDriverFactory;


public class BasePage {
	
	//CLICK METHOD Archana	
	protected void clickOnElement(By locator) {
		try {
			WebDriverFactory.getDriver().findElement(locator).click();
		} catch (NoSuchElementException e) {
			String currentTimeStamp = new SimpleDateFormat("MMM_dd_yyy_HHmmss").format(Calendar.getInstance().getTime());
			takeScreenshot("_Screenshot_" + currentTimeStamp);
			e.printStackTrace();
			throw new NoSuchElementException("Specified Element is not found");
		}
	}

	//SEND KEYS METHOD
	protected void sendKeysToElement(By locator, String enterText) {
		try {
			WebDriverFactory.getDriver().findElement(locator).sendKeys(enterText);
		} catch (Exception e) {
			String currentTimeStamp = new SimpleDateFormat("MMM_dd_yyy_HHmmss").format(Calendar.getInstance().getTime());
			takeScreenshot("_Screenshot_" + currentTimeStamp);
			e.printStackTrace();
			throw new NoSuchElementException("Specified Element is not found");
		}
	}
	
	//HOVER METHOD
	protected void hoverOverElement(By locator) {
		try {
			WebElement element = WebDriverFactory.getDriver().findElement(locator);
			Actions action = new Actions(WebDriverFactory.getDriver());
			
			action.moveToElement(element).build().perform();
		} catch (Exception e) {
			String currentTimeStamp = new SimpleDateFormat("MMM_dd_yyy_HHmmss").format(Calendar.getInstance().getTime());
			takeScreenshot("_Screenshot_" + currentTimeStamp);
			e.printStackTrace();
			throw new NoSuchElementException("Specified Element is not found");
		}
	}
	
	//GET TEXT METHOD
	protected String getText(By locator) {
		return WebDriverFactory.getDriver().findElement(locator).getText();
	}

	
	//TAKE SCREENSHOT METHOD
	private static void takeScreenshot(String fileName) {
		try {
			File src = ((TakesScreenshot)WebDriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("Error" + fileName + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//ASSERT EQUALS METHOD
	protected void assertEqualsTo(By locator, String expectedMessage) {
		try {
			String actualResult = WebDriverFactory.getDriver().findElement(locator).getText();
			String expectedResult = expectedMessage;
			Assert.assertEquals(actualResult, expectedResult);
		} catch (Exception e) {
			String currentTimeStamp = new SimpleDateFormat("MMM_dd_yyy_HHmmss").format(Calendar.getInstance().getTime());
			takeScreenshot("_Screenshot_" + currentTimeStamp);
			e.printStackTrace();
			throw new NoSuchElementException("Specified Element is not found");
		}
	}
	
	protected void selectDropDown(By locator, String searchValue) {
		Select dropDown = new Select(WebDriverFactory.getDriver().findElement(locator));
		
		try {
			dropDown.selectByVisibleText(searchValue);
		} catch (Exception e) {
			String currentTimeStamp = new SimpleDateFormat("MMM_dd_yyy_HHmmss").format(Calendar.getInstance().getTime());
			takeScreenshot("_Screenshot_" + currentTimeStamp);
			e.printStackTrace();
			throw new NoSuchElementException("Specified Element is not found");
		}
	}
	
	protected void switchWindow(int index) {
		List<String> listOfWindows = new ArrayList<String>(WebDriverFactory.getDriver().getWindowHandles());
		WebDriverFactory.getDriver().switchTo().window(listOfWindows.get(index));
	}
	

}
