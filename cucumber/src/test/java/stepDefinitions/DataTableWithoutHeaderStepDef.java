package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableWithoutHeaderStepDef {

	
	WebDriver driver;
	@Given("You are on the login page")
	public void you_are_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
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

	@When("You enters the below credentials")
	public void you_enters_the_below_credentials(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<String> credentials = dataTable.asList(String.class);
		String uName = credentials.get(0);
		String pWord = credentials.get(1);
		/*String uName = dataTable.cell(0,0);
		String pWord = dataTable.cell(0,1);*/
		
		  driver.findElement(By.name("username")).sendKeys(uName);;
		   driver.findElement(By.name("password")).sendKeys(pWord);;
	}
	

	@When("login button clicking")
	public void login_button_clicking() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("You should see the homePage")
	public void you_should_see_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		String status = driver.getTitle();
		   if(status=="OrangeHRM") {
				System.out.println("sucessfully login");
			}
	}

}
