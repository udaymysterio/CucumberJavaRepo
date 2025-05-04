package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginset {

	@Given("User navigates to login page")
	public void User_navigates_to_login_page() {
}
	@When("User enters valid email address {string} into email field")
	public void User_enters_valid_email_address_into_email_field(String emailText) {	    
	}

	@And("User enters valid password {string} into password field")
	public void User_enters_valid_password_into_password_field(String passwordText) {
	}

	@And("User clicks on Login button")
	public void User_clicks_on_login_button() {
	}

	@Then("User should get successfully logged in")
	public void User_should_get_successfully_logged_in() {
	}
}
