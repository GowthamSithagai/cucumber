package TaggedHook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHooks {
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the every Scenario");
    }

	@After
    public void afterScenario(){
        System.out.println("This will run after the every Scenario");
    }

	@Before("@First or @Second")
    public void beforeFirstandSecond(){
        System.out.println("This will run only before the First and Second Scenario");
    }	

	/*
	 * @Before("@First") public void beforeFirst(){
	 * System.out.println("This will run only before the First Scenario"); }
	 */

	/*
	 * @Before("@Third") public void beforeThird(){
	 * System.out.println("This will run only before the Third Scenario"); }
	 * 
	 * @After("@First") public void afterFirst(){
	 * System.out.println("This will run only after the First Scenario"); }
	 * 
	 * @After("@Second") public void afterSecond(){
	 * System.out.println("This will run only after the Second Scenario"); }
	 * 
	 * @After("@Third") public void afterThird(){
	 * System.out.println("This will run only after the Third Scenario"); }
	 */

}
