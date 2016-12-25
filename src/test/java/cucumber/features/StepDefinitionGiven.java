package cucumber.features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;

public class StepDefinitionGiven {
	@Given("^this is given$")
	public void shouldNavidateToSite() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspaces\\Neon\\POCs\\CucumberRunner\\lib\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
	   wd.get("http://www.google.co.in");
	   }


}
