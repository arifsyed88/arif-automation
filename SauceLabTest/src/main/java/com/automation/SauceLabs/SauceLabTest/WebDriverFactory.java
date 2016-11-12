package com.automation.SauceLabs.SauceLabTest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;

public class WebDriverFactory {
	
	protected static WebDriver driver = null;
	private static final String URL = "https://facebook.com/";
	public static final String USERNAME = "arifsyed88";
	public static final String ACCESS_KEY = "3b41ee74-aa70-4f80-8049-ffb0863c31ae";
    public static final String SLURL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	public static WebDriver getDriver() {
		return driver;
	}
	
//	public static void setDriver(WebDriver driver) {
//		WebDriverFactory.driver = driver;
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
	
	public void setDriver(int driverNumber) {
		switch(driverNumber){
		case 1:
			setSauceLabs();
			break;
		case 2:
			setChromeLocal();
			break;
		case 3:
			setFirefoxLocal();
			break;
		default:
			setChromeLocal();
			break;
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	private void setSauceLabs(){
		 try {
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			    caps.setCapability("platform", "Windows XP");
			    caps.setCapability("version", "43.0");
			    driver = new RemoteWebDriver(new URL(SLURL), caps);
			    
			    driver.get(URL);
			    
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	private void setChromeLocal() {
		System.setProperty("webdriver.chrome.driver", "/Users/arifsyed/Documents/JarLib/chromedriver");
		driver = new ChromeDriver();
	}
	
	private void setFirefoxLocal() {
		System.setProperty("webdriver.gecko.driver", "/Users/arifsyed/Documents/JarLib/geckodriver");
		driver = new FirefoxDriver();
	}
	
	
	
	@BeforeClass
	public void initializeWebDriver() {
		setDriver(1);
	}
	

	@AfterClass
	public void tearDown() {
		if (driver != null);
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}

