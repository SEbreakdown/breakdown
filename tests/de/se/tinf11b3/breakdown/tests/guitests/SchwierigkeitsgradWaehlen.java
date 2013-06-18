package de.se.tinf11b3.breakdown.tests.guitests;


import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

import cucumber.annotation.After;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import de.se.tinf11b3.breakdown.tests.SeleniumHandler;
import static org.junit.Assert.*;

public class SchwierigkeitsgradWaehlen {

	

	@When("^I press “Spiel starten”$")
	public void I_press_Spiel_starten() throws Throwable {
		SeleniumHandler.selenium.open("/Breakdown"); // Seite aufrufen
		for(int second = 0;; second++) {
			if(second >= 60)
				fail("timeout"); // Warte bis SpielStartenButton geladen
			try {
				if(SeleniumHandler.selenium.isElementPresent("css=span.v-button-caption"))
					break;
			}
			catch(Exception e) {
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		SeleniumHandler.selenium.click("css=span.v-button-caption"); // Spiel Starten klicken

		for(int second = 0;; second++) {
			if(second >= 60)
				fail("timeout"); // Warten bis Leicht geladen
			try {
				if(SeleniumHandler.selenium.isElementPresent("css=span.v-button-wrap"))
					break;
			}
			catch(Exception e) {
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for(int second = 0;; second++) {
			if(second >= 60)
				fail("timeout"); // Warten bis MIttelbutton geladen
			try {
				if(SeleniumHandler.selenium.isElementPresent("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[3]/div/div/span"))
					break;
			}
			catch(Exception e) {
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for(int second = 0;; second++) { // Warte bis SchwerBUtton geladen
			if(second >= 60)
				fail("timeout");
			try {
				if(SeleniumHandler.selenium.isElementPresent("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[2]/div/div/span"))
					break;
			}
			catch(Exception e) {
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Then("^I should see “Leicht”$")
	public void I_should_see_Leicht() throws Throwable {
		assertTrue(SeleniumHandler.selenium.isTextPresent("Leicht")); // Gibt es Leichtbutton?
		assertTrue(SeleniumHandler.selenium.isTextPresent("Mittel")); // Gibt es Mittelbutton?
		assertTrue(SeleniumHandler.selenium.isTextPresent("Schwer")); // Gibt es Schwerbutton?
		SeleniumHandler.selenium.click("css=span.v-button-wrap");
		for(int second = 0;; second++) {
			if(second >= 60)
				fail("timeout"); // Warte bis Spielcanvas geladen
			try {
				if(SeleniumHandler.selenium.isElementPresent("css=canvas"))
					break;
			}
			catch(Exception e) {
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		assertTrue(SeleniumHandler.selenium.isElementPresent("css=canvas")); // Spielcanvas
																// vorhanden?
	}

	@Then("^I should see “Mittel”$")
	public void I_should_see_Mittel() throws Throwable {
		// BUTTON MITTEL

		SeleniumHandler.selenium.open("/Breakdown"); // Seite neu laden
		for(int second = 0;; second++) {
			if(second >= 60)
				fail("timeout"); // warten bis spielstartenbutton geladen
			try {
				if(SeleniumHandler.selenium.isElementPresent("css=span.v-button-caption"))
					break;
			}
			catch(Exception e) {
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		SeleniumHandler.selenium.click("css=span.v-button-caption"); // spielstarten klicken
		for(int second = 0;; second++) {
			if(second >= 60)
				fail("timeout"); // Warten bis mittelbutton present
			try {
				if(SeleniumHandler.selenium.isElementPresent("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[2]/div/div/span"))
					break;
			}
			catch(Exception e) {
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// Mittel Button klicken
		SeleniumHandler.selenium.click("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[2]/div/div/span");
		for(int second = 0;; second++) {
			if(second >= 60)
				fail("timeout"); // Warten bis Spielcanvas vorhanden
			try {
				if(SeleniumHandler.selenium.isElementPresent("css=canvas"))
					break;
			}
			catch(Exception e) {
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		assertTrue(SeleniumHandler.selenium.isElementPresent("css=canvas")); // GIbt es ein
																// Canvas?
	}

	@Then("^I should see “Schwer”$")
	public void I_should_see_Schwer() throws Throwable {

		// Schwer BUtton

		SeleniumHandler.selenium.open("/Breakdown"); // Seite neu laden
		for(int second = 0;; second++) {
			if(second >= 60)
				fail("timeout"); // warten bis spielstartenbutton geladen
			try {
				if(SeleniumHandler.selenium.isElementPresent("css=span.v-button-caption"))
					break;
			}
			catch(Exception e) {
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		SeleniumHandler.selenium.click("css=span.v-button-caption"); // Spielstarten klicken
		for(int second = 0;; second++) {
			if(second >= 60)
				fail("timeout"); // Warten bis SChwer Button geladen
			try {
				if(SeleniumHandler.selenium.isElementPresent("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[3]/div/div/span"))
					break;
			}
			catch(Exception e) {
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// SChwer bUtton klicken
		SeleniumHandler.selenium.click("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[3]/div/div/span");
		for(int second = 0;; second++) {
			if(second >= 60)
				fail("timeout"); // Warten bis Canvas geladen
			try {
				if(SeleniumHandler.selenium.isElementPresent("css=canvas"))
					break;
			}
			catch(Exception e) {
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// Canvas vorhanden
		assertTrue(SeleniumHandler.selenium.isElementPresent("css=canvas"));
//		SeleniumHandler.selenium.close();
	}

	 

}