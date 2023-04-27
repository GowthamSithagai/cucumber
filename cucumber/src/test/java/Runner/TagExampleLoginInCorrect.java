package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/tag.feature" ,glue= { "stepDefinitions"} ,plugin = {"html:report/WebReport","json:report/jsonreport.json","junit:report/xmlreports.xml"},
monochrome = true,tags="@Negative")
public class TagExampleLoginInCorrect {
	
	
	
}	
