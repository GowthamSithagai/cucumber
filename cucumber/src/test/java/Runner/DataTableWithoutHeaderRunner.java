package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/DataTableWithoutHeader.feature" ,glue= {"stepDefinitions"},
monochrome = true)
public class DataTableWithoutHeaderRunner {
	
	
	
}	

