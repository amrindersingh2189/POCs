package cucumber.features.outline.datatable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class GoogleTestStepDefinitionOutlineDataTable {
	WebDriver wd = null;
	@Before
	public void buildEnvironment(){
		System.out.println("start");
//		System.setProperty("webdriver.chrome.driver", "D:\\Workspaces\\Neon\\POCs\\CucumberRunner\\lib\\chromedriver.exe");
//		wd = new ChromeDriver();
	}
	@After
	public void closeEnvironment(){
		System.out.println("close");
//		wd.close();
	}
	@Before("@web")
	public void buildEnvironmentTag(){
		System.out.println("Tag start");
		System.setProperty("webdriver.chrome.driver", "D:\\Workspaces\\Neon\\POCs\\CucumberRunner\\lib\\chromedriver.exe");
		wd = new ChromeDriver();
	}
	@After("@web")
	public void closeEnvironmentTag(){
		System.out.println("Tag close");
		wd.close();
	}
	@Given("^go to google\\.co\\.in$")
	public void go_to_google_co_in() throws Throwable {
		
		wd.navigate().to("http://www.google.co.in");
	}

	@When("^pass ([^\"]*) in the seachbox$")
	public void pass_in_the_seachbox(String searchText) throws Throwable {
		wd.findElement(By.id("lst-ib")).sendKeys(searchText);
	    Thread.sleep(2000);
	}

	@When("^click on Google Search button$")
	public void click_on_Google_Search_button() throws Throwable {
		wd.findElement(By.xpath("//form[@id='tsf']/div[2]/div[2]/div[1]/div[1]/div[3]/button[@id='_fZl']")).click();;
		 
	}

	@Then("^check if the title of the page is ([^\"]*)$")
	public void check_if_the_title_of_the_page_is(String title) throws Throwable {
		Assert.assertTrue("You are in some other world", wd.getTitle().equals(title));
		 
	}
	


}
