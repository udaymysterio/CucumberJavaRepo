package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

	@Given("User opens the Application")
	public void User_opens_the_Application() {
	}
	@When("User enters valid product {string} into Search box field")
	public void  User_enters_valid_product_into_Search_box_field(String productText) {
	}
    @And("User clicks on Search button")
	public void User_clicks_on_Search_button() {
    }    
	@Then("User should get valid product displayed in search results")
	public void User_should_get_valid_product_displayed_in_search_results() {
}
}