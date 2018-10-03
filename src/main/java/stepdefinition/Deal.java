package stepdefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Deal {
	WebDriver driver;
	
	@Given("^user homepage$")
	public void user_homepage(DataTable arg1) throws Throwable {
	    
	}

	@When("^user clicks on new deal$")
	public void user_clicks_on_new_deal(DataTable arg1) throws Throwable {
	   
	}

	@Then("^user clicks on new task$")
	public void user_clicks_on_new_task(DataTable arg1) throws Throwable {
	    
	}

	@Then("^user browers closed$")
	public void user_browers_closed() throws Throwable {
	   
	}

}
