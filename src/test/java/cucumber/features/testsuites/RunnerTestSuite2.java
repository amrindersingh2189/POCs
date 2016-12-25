package cucumber.features.testsuites;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RunnerTestSuite2 {
	@Given("^test scenario three given$")
	public void test_scenario_three_given() throws Throwable {
		System.out.println("scene 3 given");
	}

	@When("^test scenario three when$")
	public void test_scenario_three_when() throws Throwable {
		System.out.println("scene 3 given");
	}

	@Then("^test scenario three then$")
	public void test_scenario_three_then() throws Throwable {
		System.out.println("scene 3 given");
	}


}
