package com.crm.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRMFeatureStepDef {
	
	//@Given("^I want to Login username as \"([^\"]*)\" and password as \"([^\"]*)\" $")
	@Given("I want to Login username as {string} and password as {string}")
	public void i_want_to_login_username_and_password(String username, String password) {
	 
		System.out.println(username+"_"+password);
	}
	@Given("I want to Login")
	public void i_want_to_login() {
	 
		System.out.println("Login Method");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("Action Method");
	}

	@Then("I want to Logout")
	public void i_want_to_logout() {
		
		System.out.println("Logout Method");
	    
	}


}