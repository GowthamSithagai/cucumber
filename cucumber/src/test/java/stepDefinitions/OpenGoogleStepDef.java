package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleStepDef {

	WebDriver driver;
	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in");
		
	}

	@When("^user is typing search term \"([^\"]*)\"$")
	public void user_is_typing_search_term(String arg1) throws Throwable {
	driver.findElement(By.name("q")).sendKeys(arg1);
	}

	@When("^enters the return key$")
	public void enters_the_return_key() throws Throwable {
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

	}

	@Then("^the user should see the search results for Agniprasath$")
	public void the_user_should_see_the_search_results_for_Agniprasath() throws Throwable {
	  boolean status =  driver.findElement(By.partialLinkText("agni")).isDisplayed();
	  if(status) {
		  System.out.println("search term is displayed");
	  }
	}
}
