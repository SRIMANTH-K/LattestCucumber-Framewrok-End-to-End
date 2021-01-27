package parallel;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	public WebDriver driver;
	Properties prop;

	private LoginPage lp = new LoginPage(DriverFactory.getDriver());

	@Given("user launch browser and navigate to the shopping website")
	public void user_launch_browser_and_navigate_to_the_shopping_website() {
		String url = "http://automationpractice.com/index.php";
		DriverFactory.getDriver().get(url);
		System.out.println("User is on Shopping webpage");
	}

	@When("Title of shopping page is {string}")
	public void title_of_shopping_page_is(String ExpectedTitle) {

		String Actualtile = lp.gettitle();
		System.out.println("Actual Title is :" + Actualtile);
	}

	@Then("user click on singn button and navigate to login page")
	public void user_click_on_singn_button_and_navigate_to_login_page() {

		lp.clickonsignin();

	}

	@Then("user enter mailid {string} and pass {string}")
	public void user_enter_mailid_and_pass(String username, String password) throws InterruptedException {

	
		lp.enterusername(username);

		lp.enterpass(password);
		
		lp.submittbutton();

	}

	@Then("validate loginpage Ttile")
	public void validate_loginpage_ttile() {

		String Loginpage_Ttile = lp.getLoginpageTtile();

		System.out.println("Loginpage Title is: " + Loginpage_Ttile);
	}
	@Then("user is on Accounts Page")
	public void user_is_on_accounts_page() {
	    
		String Accountpage_Title_is = lp.getTitleofAccountpage();
		
		System.out.println("Accountpage Title is : " + Accountpage_Title_is );
	}
}
