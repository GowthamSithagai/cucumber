package Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features= "FeatureFiles/Expressions.feature", glue="stepDefinitions")
public class ExpressionRunner {
	
	//it should combine the feature file and the step definition

}
