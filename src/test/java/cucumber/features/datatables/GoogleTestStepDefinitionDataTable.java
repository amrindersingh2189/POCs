package cucumber.features.datatables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class GoogleTestStepDefinitionDataTable {
	WebDriver wd = null;
	
	/*@Given("^go to google\\.co\\.in$")
	public void go_to_google_co_in() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "D:\\Workspaces\\Neon\\POCs\\CucumberRunner\\lib\\chromedriver.exe");
			wd = new ChromeDriver();
			wd.navigate().to("http://www.google.co.in");
	}
	@When("^pass search text in the seachbox$")
	public void pass_search_text_in_the_seachbox(DataTable dataTable) throws Throwable {
		List<List<String>> rowsCol = dataTable.raw();
		wd.findElement(By.id("lst-ib")).sendKeys(rowsCol.get(1).get(1));
			    Thread.sleep(2000);
	}
	

	@And("^click on Google Search button$")
	public void click_on_Google_Search_button() throws Throwable {
		 wd.findElement(By.xpath("//form[@id='tsf']/div[2]/div[2]/div[1]/div[1]/div[3]/button[@id='_fZl']")).click();;
		   
	}

	@Then("^check if the title of the page is as per below table$")
	public void check_if_the_title_of_the_page_is_as_per_below_table(DataTable dataTable) throws Throwable {
		List<List<String>> rowsCol = dataTable.raw();
		System.out.println(rowsCol.size());
		Assert.assertTrue("You are in some other world", wd.getTitle().equals(rowsCol.get(1).get(1)));
		
		 wd.close();
	}*/
}
