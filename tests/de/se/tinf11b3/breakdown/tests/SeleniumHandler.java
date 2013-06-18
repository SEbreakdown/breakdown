package de.se.tinf11b3.breakdown.tests;

import org.junit.AfterClass;
import org.testng.annotations.AfterSuite;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

import cucumber.annotation.en.Given;

public class SeleniumHandler {

	public static Selenium selenium;

	@Given("^I started the Application$")
	public void I_started_the_Application() throws Throwable {
		if(selenium == null) {
			selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://localhost:8080/Breakdown/");
			selenium.start();
			attachShutDownHook();
		}
	}

	public static void attachShutDownHook() {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				selenium.close();
				selenium = null;
			}
		});
	}

}
