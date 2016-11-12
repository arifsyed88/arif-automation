package com.automation.facebook.MavenFacebook;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.automation.SauceLabs.SauceLabTest.WebDriverFactory;

public class Notes extends WebDriverFactory {
	
	HomePage homePage = new HomePage();
	AboutPage aboutPage = new AboutPage();
	NotesPage notesPage = new NotesPage();
	
	@Test
	public void notesPageVerification() {
		homePage.clickAbout();
		aboutPage.clickNotes();
		notesPage.assertNotesPage();
	}

}
