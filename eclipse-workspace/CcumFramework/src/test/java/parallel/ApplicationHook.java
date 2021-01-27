package parallel;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.utilityreader.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class ApplicationHook {

	
	public WebDriver driver;
	
	private DriverFactory driverfac;
	
	private ConfigReader config;
	
	Properties prop;
	
	@Before(order = 0)
	public void getProperty() throws IOException {
		config = new ConfigReader();
		prop = config.initializeprop();
		
		String browserName = prop.getProperty("browser");
		
		
		driverfac = new DriverFactory();
		driver = driverfac.init_driver(browserName);
		
		
		
	}
	@After(order = 1)
	public void quitBrowser() {
		driver.quit();
	}
	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}
	}
	
}
