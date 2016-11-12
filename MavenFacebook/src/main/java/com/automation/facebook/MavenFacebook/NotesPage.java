package com.automation.facebook.MavenFacebook;

import org.openqa.selenium.By;

public class NotesPage extends BasePage {

	private By notesMessage = By.linkText("Notes");
	
	public void assertNotesPage() {
		assertEqualsTo(notesMessage, "Notes");
	}
}
