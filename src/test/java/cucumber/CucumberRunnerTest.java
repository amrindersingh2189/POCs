package cucumber;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty","json:target/output.json","html:target/html"},
		features = {"src/test/java/cucumber/features/testsuites"},
		tags = {"@first,@third"}
		)
public class CucumberRunnerTest {

}
