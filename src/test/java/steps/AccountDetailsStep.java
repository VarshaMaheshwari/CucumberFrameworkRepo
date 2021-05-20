package steps;


import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountDetailsPage;
import pages.LoginAutomationSitePage;
import pages.MyAccountMenuPage;
import qaFactory.DriverFactory;

public class AccountDetailsStep {

	//private WebDriver driver;
	private LoginAutomationSitePage loginPage=new LoginAutomationSitePage(DriverFactory.getDriver());
	private MyAccountMenuPage myAcctMenuPage;
	private AccountDetailsPage acctDetailsPage;
	
	@Given("user has already logged into  application")
	public void user_has_already_logged_into_application(DataTable loginCredsTable) {
		
		List<Map<String,String>> userCredList=loginCredsTable.asMaps();
	   String uName=userCredList.get(0).get("userName");
	   String pwd=userCredList.get(0).get("password");
	   myAcctMenuPage= loginPage.doLogin(uName, pwd);
	   
	}

	
	@Then("user is on My account menu screen")
	public void user_is_on_my_account_menu_screen() {
		Assert.assertTrue(myAcctMenuPage.isAccountDetailsLinkPresent());
		
	}

	@Then("selects Account Details link")
	public void selects_account_details_link() {
		acctDetailsPage=myAcctMenuPage.clickOnAccountDetailsLink();
	}

	@Then("user is navigated to Account Details screen")
	public void user_is_navigated_to_my_details_screen() {
		System.out.println("user is navigated to Account Details screen");
		Assert.assertTrue(acctDetailsPage.isFirstNamePresent());
	}

	@Given("user is on Account Details screen")
	public void user_is_on_account_details_screen() {
	 Assert.assertTrue(acctDetailsPage.isFirstNamePresent());
	}

	@When("user enters First name as {string} and Last Name as {string}")
	public void user_enters_first_name_as_and_last_name_as(String firstName, String lastName) {
		acctDetailsPage.enterFirstName(firstName);
		acctDetailsPage.enterLastName(lastName);
	}

	@When("clicks on save changes button")
	public void clicks_on_save_changes_button() {
		acctDetailsPage.clickOnSaveChanges();
	}

	@Then("user is navigated to My account menu screen")
	public void user_is_navigated_to_my_account_menu_screen() {
		myAcctMenuPage=acctDetailsPage.returnToMyAccountMenuPage();
		Assert.assertTrue(myAcctMenuPage.isOnMyAccountMenuPage());
	}

	
	
}
