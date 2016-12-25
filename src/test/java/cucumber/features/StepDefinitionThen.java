package cucumber.features;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionThen {


	@Then("^test this then$")
	public void shouldCheckPageView() throws Throwable {
		   System.out.println("I am checking if page view is fine in the website");	

	}

}
