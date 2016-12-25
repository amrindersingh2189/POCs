package cucumber.features.testsuites;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RunnerTestSuite1 {

	@Given("^test scenario one given$")
	public void test_scenario_one_given() throws Throwable {
	    System.out.println("scene 1 given");
	}

	@When("^test scenario one when$")
	public void test_scenario_one_when() throws Throwable {
		System.out.println("scene one when");
	}

	@Then("^test scenario one then$")
	public void test_scenario_one_then() throws Throwable {
		System.out.println("scene 1 then");
	}

	@Given("^test scenario two given$")
	public void test_scenario_two_given() throws Throwable {
		System.out.println("scene 2 given");
	}

	@When("^test scenario two when$")
	public void test_scenario_two_when() throws Throwable {
		System.out.println("scene two when");
	}

	@Then("^test scenario two then$")
	public void test_scenario_two_then() throws Throwable {
		System.out.println("scene two then");
	}
}
