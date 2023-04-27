package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundStepDef {

	
	@Given("The student finished high school")
	public void the_student_finished_high_school() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The student finished high school");
	}

	@Given("The student finished higher secondary")
	public void the_student_finished_higher_secondary() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("The student finished higher secondary");
	}
	
	@Given("the student applied for the medical course")
	public void the_student_applied_for_the_medical_course() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("the student applied for the medical course");
	}

	@When("the student cleared the entrance exam")
	public void the_student_cleared_the_entrance_exam() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the student cleared the entrance exam");
	}

	@Then("the student is eligible for joining any medical institute")
	public void the_student_is_eligible_for_joining_any_medical_institute() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the student is eligible for joining any medical institute");
	}

	@Given("the student applied for the Engineering course")
	public void the_student_applied_for_the_engineering_course() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the student applied for the Engineering course");
	}

	@When("the student has a sayable cut off")
	public void the_student_has_a_sayable_cut_off() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the student has a sayable cut off");
	}

	@Then("the student is eligible for joining any Engineering institute")
	public void the_student_is_eligible_for_joining_any_engineering_institute() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the student is eligible for joining any Engineering institute");
	}


}
