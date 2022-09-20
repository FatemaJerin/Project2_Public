package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleSearch {
	
	WebDriver driver;
	
	@Given("^I am on google page \"([^\"]*)\"$")
	public void i_am_on_google_page(String string) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe"  );
        driver = new ChromeDriver();
        driver.get(string);
	    
	}

	@When("^I search = \"([^\"]*)\"$")
	public void i_search(String string) {
		
		driver.findElement(By.name("q")).sendKeys(string);
	    
	}

	@When("^I click on google search button$")
	public void i_click_on_google_search_button() {
		
		 driver.findElement(By.name("btnK")).submit();
	   
	}


}
