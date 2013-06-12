package de.se.tinf11b3.breakdown.tests.guitests;

import static org.junit.Assert.assertEquals;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

import cucumber.annotation.After;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import com.thoughtworks.selenium.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;



public class Game_Description {

	private Selenium selenium;
	
	
	@When("^I press “Spielbeschreibung”$")
	public void I_press_Spielbeschreibung() throws Throwable {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://localhost:8080/");
		selenium.start();
		selenium.open("/Breakdown/");
		selenium.click("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[2]/div/div/span");
	}

	@Then("^I should see “Spielverlauf”$")
	public void I_should_see_Spielverlauf() throws Throwable {
		assertTrue((selenium.isTextPresent("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[2]/div/textarea")));
		
	}

	@Then("^I should see “Steuerung”$")
	public void I_should_see_Steuerung() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		selenium.close();
	    throw new PendingException();
	}

	
	
}