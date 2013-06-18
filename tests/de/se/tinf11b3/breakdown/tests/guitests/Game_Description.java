package de.se.tinf11b3.breakdown.tests.guitests;

import static org.junit.Assert.assertEquals;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import static org.junit.Assert.*;
import cucumber.annotation.After;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import de.se.tinf11b3.breakdown.tests.SeleniumHandler;



public class Game_Description {

	
	@When("^I press “Spielbeschreibung”$")
	public void I_press_Spielbeschreibung() throws Throwable {
		 
		SeleniumHandler.selenium.open("/Breakdown");
		SeleniumHandler.selenium.click("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[2]/div/div/span/span");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (SeleniumHandler.selenium.isElementPresent("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[2]/div/textarea")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		assertTrue(SeleniumHandler.selenium.isTextPresent("zurueck zum Hauptmenue"));
	}

	@Then("^I should see “Spielverlauf”$")
	public void I_should_see_Spielverlauf() throws Throwable {
		
		assertTrue(SeleniumHandler.selenium.getValue("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[2]/div/textarea").matches("^[\\s\\S]*Spielverlauf[\\s\\S]*$"));
		
	}

	@Then("^I should see “Steuerung”$")
	public void I_should_see_Steuerung() throws Throwable {
		
		assertTrue(SeleniumHandler.selenium.getValue("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[2]/div/textarea").matches("^[\\s\\S]*Steuerung[\\s\\S]*$"));
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (SeleniumHandler.selenium.isElementPresent("css=img.v-icon")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		SeleniumHandler.selenium.click("css=span.v-button-caption");
		
	}

	
	
}