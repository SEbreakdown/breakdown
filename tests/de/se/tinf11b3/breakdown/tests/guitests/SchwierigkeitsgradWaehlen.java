package de.se.tinf11b3.breakdown.tests.guitests;


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

	@When("^I press “Spiel starten”$")
	public void I_press_Spiel_starten() throws Throwable {
		selenium.open("/Breakdown/");
		try{
			selenium.click("css=span.v-button-wrap");	//Spielstart
		}
		catch(com.thoughtworks.selenium.SeleniumException e){
			assertFalse(true);
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