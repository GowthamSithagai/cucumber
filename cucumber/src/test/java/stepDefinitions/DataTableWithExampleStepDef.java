package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableWithExampleStepDef {

	
	WebDriver driver;
	@Given("Proceed to login page")
	public void proceed_to_login_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//maximum limit is 40,if the page loaded with in 2 sec other times are ignored
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String uName, String pWord) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys(uName);
		driver.findElement(By.name("password")).sendKeys(pWord);
	}

	@When("login button")
	public void login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	
}
