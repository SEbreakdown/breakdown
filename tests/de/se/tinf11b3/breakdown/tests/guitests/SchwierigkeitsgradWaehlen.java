package de.se.tinf11b3.breakdown.tests.guitests;


import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

import cucumber.annotation.After;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import static org.junit.Assert.*;

public class SchwierigkeitsgradWaehlen {

	private Selenium selenium;
	
	
	
	@Given("^I started the Application$")
	public void I_started_the_Application() throws Throwable {
		selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://localhost:8080/Breakdown/");
		selenium.start();
	}
	
	
	
	private void omg() {
		selenium.open("/Breakdown");				//Seite aufrufen
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");		//Warte bis SpielStartenButton geladen
			try { if (selenium.isElementPresent("css=span.v-button-caption")) break; } catch (Exception e) {}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		selenium.click("css=span.v-button-caption");		//Spiel Starten klicken
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");		//Warten bis Leicht geladen
			try { if (selenium.isElementPresent("css=span.v-button-wrap")) break; } catch (Exception e) {}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");		//Warten bis MIttelbutton geladen
			try { if (selenium.isElementPresent("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[3]/div/div/span")) break; } catch (Exception e) {}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (int second = 0;; second++) {			//Warte bis SchwerBUtton geladen
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[2]/div/div/span")) break; } catch (Exception e) {}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		assertTrue(selenium.isTextPresent("Leicht"));		//Gibt es Leichtbutton?
		assertTrue(selenium.isTextPresent("Mittel"));		//Gibt es Mittelbutton?
		assertTrue(selenium.isTextPresent("Schwer"));		//Gibt es Schwerbutton?
		selenium.click("css=span.v-button-wrap");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");		//Warte bis Spielcanvas geladen
			try { if (selenium.isElementPresent("css=canvas")) break; } catch (Exception e) {}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		assertTrue(selenium.isElementPresent("css=canvas"));	//Spielcanvas vorhanden?


//BUTTON MITTEL



		selenium.open("/Breakdown");				//Seite neu laden
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");		//warten bis spielstartenbutton geladen
			try { if (selenium.isElementPresent("css=span.v-button-caption")) break; } catch (Exception e) {}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		selenium.click("css=span.v-button-caption");		//spielstarten klicken
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");		//Warten bis mittelbutton present
			try { if (selenium.isElementPresent("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[2]/div/div/span")) break; } catch (Exception e) {}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
									//Mittel Button klicken
		selenium.click("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[2]/div/div/span");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");		//Warten bis Spielcanvas vorhanden
			try { if (selenium.isElementPresent("css=canvas")) break; } catch (Exception e) {}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		assertTrue(selenium.isElementPresent("css=canvas"));	//GIbt es ein Canvas?


//Schwer BUtton



		selenium.open("/Breakdown");				//Seite neu laden
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");		//warten bis spielstartenbutton geladen
			try { if (selenium.isElementPresent("css=span.v-button-caption")) break; } catch (Exception e) {}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		selenium.click("css=span.v-button-caption");		//Spielstarten klicken
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");		//Warten bis SChwer Button geladen
			try { if (selenium.isElementPresent("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[3]/div/div/span")) break; } catch (Exception e) {}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		//SChwer bUtton klicken
		selenium.click("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[3]/div/div/span");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");	//Warten bis Canvas geladen
			try { if (selenium.isElementPresent("css=canvas")) break; } catch (Exception e) {}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Canvas vorhanden
		assertTrue(selenium.isElementPresent("css=canvas"));
	
	
}
	
	
	
	
	

	
	@When("^I press “Spiel starten”$")
	public void I_press_Spiel_starten() throws Throwable {
		selenium.open("/Breakdown/");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");		//SpielStarten present
			try { if (selenium.isElementPresent("css=span.v-button-caption")) break; } catch (Exception e) {assertFalse(true);}
			Thread.sleep(1000);
		}
		
	}
	
	
	

	@Then("^I should see “Leicht”$")
	public void I_should_see_Leicht() throws Throwable {
		try{
			selenium.click("css=span.v-button-wrap");	//Leicht
		}
		catch(com.thoughtworks.selenium.SeleniumException e){
			assertFalse(true);
		}
		
	}

	@Then("^I should see “Mittel”$")
	public void I_should_see_Mittel() throws Throwable {
		try{
			selenium.click("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[2]/div/div/span");	//Mittel
		}
		catch(com.thoughtworks.selenium.SeleniumException e){
			assertFalse(true);
		}
	}

	@Then("^I should see “Schwer”$")
	public void I_should_see_Schwer() throws Throwable {
		try{
			selenium.click("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[3]/div/div/span"); // Schwer
		}
		catch(com.thoughtworks.selenium.SeleniumException e){
			assertFalse(true);
		}
	}
	
	@After
	public void shutdown(){
		selenium.stop();
	}
	
}