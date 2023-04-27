package stepDefinitions;

import io.cucumber.java.en.Given;

public class ExpressionStepDef {

	
	@Given("^I have (\\d+) laptop$")
	public void i_have_laptop(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Laptop Count"+int1);
	}

	@Given("^I have a (\\d+\\.\\d+) CGPA$")
	public void i_have_a_cgpa(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("My CGPA is"+double1);
	}

	@Given("^\"(.*?)\" loves \"(.*?)\"$")
	public void loves(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string +"loves"+string2);
	}
}
