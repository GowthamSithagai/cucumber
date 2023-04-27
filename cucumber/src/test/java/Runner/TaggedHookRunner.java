package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/TaggedHook.feature" ,glue= { "stepDefinitions","TaggedHook"} ,plugin = {"html:report/WebReport","json:report/jsonreport.json","junit:report/xmlreports.xml"},
monochrome = true,tags="@TaggedHooksExample" )
public class TaggedHookRunner {
	
	
	
}	
