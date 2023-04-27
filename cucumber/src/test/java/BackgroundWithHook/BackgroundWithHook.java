package BackgroundWithHook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BackgroundWithHook {
	@Before
	public void beforeScenario() {
		System.out.println("This will run before all scenario");
		
	}
	
	@After
	public void afterScenario() {
		System.out.println("This will run after all scenario");
	}
}
