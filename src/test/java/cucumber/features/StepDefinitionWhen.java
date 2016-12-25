package cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionWhen {
	

	@When("^when it is given$")
	public void shouldClickOnAbout() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspaces\\Neon\\POCs\\CucumberRunner\\lib\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.findElement(By.id("lst-ib")).sendKeys("hello world");;
	}


}
