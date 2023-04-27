package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookBeforeAfter {

	
	@Before(order=1)
	public void beforeScenario() {
		System.out.println("Thanos collecting the infinity stones");
		
	}
	
	@After(order=1)
	public void afterScenario() {
		System.out.println("After killing everyone,taking rest on garden");
	}
	
	@Before(order=0)
	public void beforetoBeforeSceario() {
		System.out.println("Thanos has to be born");
		
	}
	
	@After(order=0)
	public void aftertoAfterScenario() {
		System.out.println("Finally Thonas is also dying");
	}
}
