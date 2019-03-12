package stepDefinition;

import config.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NpvPage;

public class NpvValidationStepDef extends Base {

	NpvPage npv;

	@Given("^I launch the browser$")
	public void I_launch_the_browser() throws Throwable {
		initialization();
	}

	@When("^I navigate to npv page$")
	public void i_navigate_to_npv_page() throws Throwable {
		navigatTo("url");
	}

	@Then("^I verify right number of values appeared on the screen$")
	public void i_verify_right_number_of_values_appeared_on_the_screen() throws Throwable {
//		npv = new NpvPage();
//		npv.countElements("lbl_val_", 5);
	}

	@And("^I verify all the values appeared are greater than zero$")
	public void i_verify_all_the_values_appeared_are_greater_than_zero() throws Throwable {
//		npv.checkValues();
	}

	@And("^I verify total balance matched the sum of the values$")
	public void i_verify_total_balance_matched_the_sum_of_the_values() throws Throwable {
//		npv.verifyTotal();
	}

	@And("^I verify all the values are formatted as currencies$")
	public void i_verify_all_the_values_are_formatted_as_currencies() throws Throwable {
//		npv.isCurrency();
//		OR
//		npv.isCurrencyFormat();
	}

	@And("^I verify given total balance is correct$")
	public void i_verify_given_total_balance_is_correct() throws Throwable {
//		npv.verifyTotal();
	}

	@And("^I complete my test$")
	public void i_complete_my_test() throws Throwable {
		tearDown();
	}
}