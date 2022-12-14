package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
        features = "src/test/resources/features", strict=true, glue="TestLoginStep",
        		plugin = {"html:target/cucumber-report.html"}
        
  )     
public class Run {

}
