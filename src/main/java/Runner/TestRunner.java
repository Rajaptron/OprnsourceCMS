package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features= "Features",
		glue= {"Stepdefination"}
		//format= {"pretty","html:test-output"}
		
		)
public class TestRunner {
	
	

}
