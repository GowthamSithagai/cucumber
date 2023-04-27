package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataStepDef {
 WebDriver driver;
	
	@Given("user  is on login page Of OrangeHRM")
	public void user_is_on_login_page_of_orange_hrm() {
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

	@When("^The user enters valid credentials \"(.*?)\" and \"(.*?)\"$")
	public void the_user_enters_valid_credentials_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("username")).sendKeys(username);;
		   driver.findElement(By.name("password")).sendKeys(password);;
	}

	@When("Click the login button")
	public void click_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}


	@Then("The user should be navigated to OrangeHRM homepage")
	public void the_user_should_be_navigated_to_orange_hrm_homepage() {
		 String title = driver.getTitle();
		   if(title=="OrangeHRM") {
			   System.out.println("Login successfully");
		   }
	}

}
