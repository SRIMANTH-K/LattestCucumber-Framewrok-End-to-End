package parallel;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.pages.AccountPage;
import com.qa.pages.ContactUsPage;
import com.qa.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountsPageTest {
	
	public WebDriver driver;
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());
	private AccountPage ap;
	private ContactUsPage cp = new ContactUsPage(DriverFactory.getDriver());
	@Given("user is on loginpage")
	public void user_is_on_loginpage() {
	    
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=my-account");
		String LoginpageTiltee_is = lp.getLoginpageTtile();
		
		System.out.println("Loginpage title is :" + LoginpageTiltee_is);
	}

	@Given("use enter userid and pass")
	public void use_enter_userid_and_pass(io.cucumber.datatable.DataTable dataTable) {
	    
		List<Map<String,String>> creddata=  dataTable.asMaps();
		
		String username = creddata.get(0).get("username");
		
		String password = creddata.get(0).get("password");
		
		ap = lp.combinelogin(username, password);
		
		System.out.println("user Id is : "+ username +  " and " +  "pass is :"+ password);
	}

	@When("accounts page title should be {string}")
	public void accounts_page_title_should_be(String ExpectedTtile) {
	    
	
	String ataultitle= ap.getAcoountPageTitle();
	
		System.out.println("Accountpage title is:" + ataultitle );
	}

	@Then("User getts Total Account Sections Text")
	public void user_getts_total_account_sections_Text() {
	    
		
		ap.sectiontext();
	
	}

	@When("Sections count {int}")
	public void sections_count(Integer Actualsectioncount) {
		
		Assert.assertTrue(ap.getacountcount() == Actualsectioncount);
		
		System.out.println("sections count is:" + ap.getacountcount());
	}
	
	@Given("User is click on ContactUs Page")
	public void user_is_click_on_contact_us_page() {
	    
		DriverFactory.getDriver().get("http://automationpractice.com/index.php");
		
		cp.clickoncontactpage();
		
	}

	@When("Title of contact page is {string}")
	public void title_of_contact_page_is(String Actaul_Titleof_Contact_Pgae) {
	    
		String ContactpageTitle= cp.getcontactpagetitle();
		
		System.out.println("The contact page title is:" +  ContactpageTitle);
		
	}
	@Then("User sholud select Subject Heading")
	public void user_sholud_select_subject_heading() {
	    
		cp.getsubjectheading();
		
	}
	@Then("User eneter {string} and {string}")
	public void user_eneter_and(String Email, String Order_reference) {
	    
		cp.entermailid(Email);
		cp.orderref(Order_reference);
		
	}
	@Then("user eneter Message in Message Box {string}")
	public void user_eneter_message_in_message_box(String Message) {
	    
		cp.enetermessage(Message);
	}
	@Then("user click on send button")
	public void user_click_on_send_button() {
	   
		cp.clickonsendbutton();
	}

	
	
}