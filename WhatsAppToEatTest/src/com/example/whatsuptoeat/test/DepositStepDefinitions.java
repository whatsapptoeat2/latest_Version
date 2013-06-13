package com.example.whatsuptoeat.test;

import com.example.whatsuptoeat.*;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class DepositStepDefinitions extends
		android.test.ActivityInstrumentationTestCase2<MainActivity> {
	
	private MainActivity mActivity;

	public DepositStepDefinitions() {
		super(MainActivity.class);
	}

	@Before
	public void before() {
	}

	@After
	public void after() {
	}

	@Given("^I am in \"([^\"]*)\"$")
	public void I_am_in(String arg1) {

		// Express the Regexp above with the code you wish you had
		int x = 0;
		// throw new PendingException();
	}

	@When("^I click on \"([^\"]*)\"$")
	public void I_click_on(String arg1) {
		// Express the Regexp above with the code you wish you had
		int x = 0;
		// throw new PendingException();
	}

	@Then("^I should see the screen \"([^\"]*)\"$")
	public void I_should_see_the_screen(String arg1) {
		// Express the Regexp above with the code you wish you had
		int x = 0;
		// throw new PendingException();
	}

	@Then("^there should be a \"([^\"]*)\" button$")
	public void there_should_be_a_button(String arg1) {
		// Express the Regexp above with the code you wish you had
		int x = 0;
		// throw new PendingException();
	}
}
