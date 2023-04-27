package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberOptionStepDef {
	
	WebDriver driver;
	
	@Given("user1 is entering google.co.in")
	public void user_is_entering_google_co_in() {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in");
	}

	@When("user1 is typing the search term {string}")
	public void user_is_typing_the_search_term(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(string);
	}

	@When("enters1 the return key")
	public void enters_the_return_key() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	@Then("the user should see the search results1")
	public void the_user_should_see_the_search_results() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status=driver.findElement(By.partialLinkText("agni")).isDisplayed();
		if(status) {
			System.out.println("search term displayed");
		}
	}
	
}