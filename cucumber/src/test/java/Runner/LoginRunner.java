package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features= "FeatureFiles/Login.feature", glue="stepDefinitions")
public class LoginRunner {
	
	//it should combine the feature file and the step definition

}