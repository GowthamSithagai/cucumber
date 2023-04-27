package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatTableWithHeaderStepDef {
WebDriver driver;
	
	
	@Given("Go to login page")
	public void go_to_login_page() {
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
	
	

	@When("enters the below credentials")
	public void enters_the_below_credentials(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String,String>> credentials = dataTable.asMaps(String.class,String.class);
		String uName = credentials.get(0).get("Username");
		String pWord = credentials.get(0).get("Password");
	
		
		driver.findElement(By.name("username")).sendKeys(uName);
		driver.findElement(By.name("password")).sendKeys(pWord);
	}

	@When("action on login button")
	public void action_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("You see the homePage")
	public void you_see_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		String status = driver.getTitle();
		   if(status=="OrangeHRM") {
				System.out.println("sucessfully login");
			}
	}

}
