package Stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {

	@Given("^user is in  login page of application$")
	public void user_is_in_login_page_of_application() throws Throwable {
	    System.out.println("login page");
	}

	@When("^user enter valid cerdentials & click submit$")
	public void user_enter_valid_cerdentials_click_submit() throws Throwable {
		 System.out.println("valid credentials");
	}

	@Then("^user should navigate to homepage of the application$")
	public void user_should_navigate_to_homepage_of_the_application() throws Throwable {
		 System.out.println("navigate to homepage");
	}

	@When("^user enter in-valid cerdentials & click submit$")
	public void user_enter_in_valid_cerdentials_click_submit() throws Throwable {
		 System.out.println("in-valid credentials");
	}

	@Then("^user should get error message$")
	public void user_should_get_error_message() throws Throwable {
		 System.out.println("error msg");
	}

		

	}

