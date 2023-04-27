package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagExampleLoginIncorrectStepDef {

	
WebDriver driver;
	
	@Given("user is on login page2")
	public void user_is_on_login_page() {
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

	@When("The user enters the vaild username2 and password2")
	public void the_user_enters_the_vaild_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("Admin123");
	}

	@When("Clicks on login button2")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("the user should be navigated to homePage2")
	public void the_user_should_be_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		String status = driver.getTitle();
	   if(status=="OrangeHRM") {
			System.out.println("sucessfully login");
		}
	   
	}

}
