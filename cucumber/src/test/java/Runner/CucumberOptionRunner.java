package Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(publish=true,features="featurefiles/CucumberOption.feature" ,glue= { "stepDefinitions"},
dryRun=false,monochrome = true,plugin = {"html:report/WebReport","json:report/jsonreport.json","junit:report/xmlreports.xml"})////dryRun=true == is used to check the step definitions containing methods all are defined in the feature file scenario.
public class CucumberOptionRunner {//strict=true  == same as dryRun but its check the feature file with step definition it run the defining methods and lastly it indicating the skipped methods in step definition
	
	
	
	
	
	//tag == is used to compile individual scenario 
	//tags="@a","@b"  == and condition inside the " "if  both the tag name present it will run.
	//tags="@a,@b" ==  or condition if any of the one tag name present it  will run
	//format deprecated replacement for this is plugin
}	
	
	