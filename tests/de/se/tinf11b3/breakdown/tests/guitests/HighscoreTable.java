package de.se.tinf11b3.breakdown.tests.guitests;

import static org.junit.Assert.assertEquals;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

import cucumber.annotation.After;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import de.se.tinf11b3.breakdown.tests.SeleniumHandler;
import static org.junit.Assert.*;

public class HighscoreTable {


	@When("^I press “Highscoreliste”$")
	public void I_press_Highscoreliste() throws Throwable {
		 
		SeleniumHandler.selenium.open("/Breakdown");
		SeleniumHandler.selenium.click("//div[@id='Breakdown-106497537']/div/div[2]/div/div/div/div/div/div/div[3]/div/div/span/span");
		for(int second = 0;; second++) {
			if(second >= 60)
				fail("timeout");
			try {
				if(SeleniumHandler.selenium.isElementPresent("css=span.v-button-caption"))
					break;
			}
			catch(Exception e) {
			}
			Thread.sleep(1000);
		}

	}

	@Then("^I should see “(\\d+)”$")
	public void I_should_see_(int arg1) throws Throwable {
		for(int second = 0;; second++) {
			if(second >= 60)
				fail("timeout");
			try {
				if(SeleniumHandler.selenium.isElementPresent("css=div.v-table-cell-wrapper"))
					break;
			}
			catch(Exception e) {
			}
			Thread.sleep(1000);
		}

	}


}