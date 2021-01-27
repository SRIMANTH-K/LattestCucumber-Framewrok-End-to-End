package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\srima\\eclipse-workspace\\CcumFramework\\src\\test\\resources\\parallel\\Accountspage.feature"},
		glue = {"parallel"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		publish = true
		
		)
public class LoginRunnerTest {

	
	
	
}
