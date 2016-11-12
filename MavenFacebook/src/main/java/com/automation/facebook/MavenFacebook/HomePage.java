package com.automation.facebook.MavenFacebook;
import org.openqa.selenium.By;



public class HomePage extends BasePage {
	

	private By emailTextBox = By.id("email");
	private By passWordTextBox = By.id("pass");
	private By signInButton = By.id("u_0_n");
	private By developersLink = By.linkText("Developers");
	private By createAPage = By.linkText("Create a Page");
	private By mobileNumberEntry = By.id("u_0_5");
	private By reEnterMobileNumber = By.id("u_0_8");
	private By invalidMobileOrEmailError = By.id("js_1");
	private By newPassWordEntry = By.id("u_0_a");
	private By errorIcon = By.xpath(".//*[@id='u_0_7']/i[1]");
	private By placesLink = By.linkText("Places");
	private By gamesLink = By.linkText("Games");
	private By firstNameTextBox = By.id("u_0_1");
	private By lastNameTextBox = By.id("u_0_3");
	private By newPasswordTextBox = By.id("u_0_a");
	private By monthDropDown = By.id("month");
	private By dayDropDown = By.id("day");
	private By yearDropDown = By.id("year");
	private By genderRadioMale = By.id("u_0_i");
	private By learnMoreLink = By.linkText("Learn more");
	private By january = By.xpath("//option[@value='1']");
	private By day1 = By.xpath("//select[@id='day']/option[@value='1']");
	private By year2000 = By.xpath("//option[@value='2000']");
	private By signUpButton = By.id("u_0_e");
	private By helpLink = By.linkText("Help");
	private By careersLink = By.linkText("Careers");
	private By adsChoicesLink = By.linkText("Ad Choices");
	private By aboutLink = By.linkText("About");
	private By termsLink = By.xpath("//*[@title='Review our terms and policies.']");
	
	public void logInToAccount() throws InterruptedException {
		sendKeysToElement(emailTextBox, "test@gmail.com");
		sendKeysToElement(passWordTextBox, "1234");
		clickOnElement(signInButton);
		Thread.sleep(3000);
	}
	
	public void clickDevelopersLink() {
		
		clickOnElement(developersLink);
	}
	
	public void clickCreateAPageLink() throws InterruptedException {
		clickOnElement(createAPage);
		Thread.sleep(3000);
	}
	
	public void enterNonMatchingNumber() {
		sendKeysToElement(mobileNumberEntry, "9175551234");
		sendKeysToElement(reEnterMobileNumber, "5161235555");
		clickOnElement(newPassWordEntry);
		clickOnElement(errorIcon);
		assertEqualsTo(invalidMobileOrEmailError, "Your emails or mobile numbers do not match. Please try again.");
		
	}
	
	public void clickPlaces() {
		clickOnElement(placesLink);
	}
	
	public void clickGames() {
		clickOnElement(gamesLink);
	}
	
	public void createInvalidAccount() throws InterruptedException {
		sendKeysToElement(firstNameTextBox, "x");
		sendKeysToElement(lastNameTextBox, "y");
		sendKeysToElement(mobileNumberEntry, "xy@gmail.com");
		sendKeysToElement(reEnterMobileNumber, "xy@gmail.com");
		sendKeysToElement(newPasswordTextBox, "xyz12345678");
//		clickOnElement(monthDropDown);
//		clickOnElement(january);
//		clickOnElement(dayDropDown);
//		clickOnElement(day1);
//		clickOnElement(yearDropDown);
//		clickOnElement(year2000);
		selectDropDown(monthDropDown, "Sep");
		selectDropDown(dayDropDown, "16");
		selectDropDown(yearDropDown, "1988");
		clickOnElement(genderRadioMale);
		clickOnElement(signUpButton);
		clickOnElement(learnMoreLink);
		Thread.sleep(3000);
	}
	
	public void clickHelp() {
		clickOnElement(helpLink);
	}
	
	public void clickCareers() {
		clickOnElement(careersLink);
	}
	
	public void clickAdsChoice() {
		clickOnElement(adsChoicesLink);
	}
	
	public void clickAbout() {
		clickOnElement(aboutLink);
	}
	
	public void monthDropDown(String searchValue) {
		selectDropDown(monthDropDown, searchValue);
	}
	
	public void dayDropDown(String searchValue) {
		selectDropDown(dayDropDown, searchValue);
	}
	
	public void yearDropDown(String searchValue) {
		selectDropDown(yearDropDown, searchValue);
	}
	
	public void clickTerms() {
		clickOnElement(termsLink);
	}
}
