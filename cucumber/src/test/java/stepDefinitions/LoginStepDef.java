package stepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
WebDriver driver;
	
	@Given("user  is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));//maximum limit is 40,if the page loaded with in 2 sec other times are ignored
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("The user enters valid username and password")
	public void the_user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("username")).sendKeys("Admin");;
	   driver.findElement(By.name("password")).sendKeys("admin123");;
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("The user should be navigated to homepage")
	public void the_user_should_be_navigated_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	   String title = driver.getTitle();
	   if(title=="OrangeHRM") {
		   System.out.println("Login successfully");
	   }
	}
}
