package steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginAutomationSitePage;
import qaFactory.DriverFactory;

public class LoginAutomationSiteStep {

	private LoginAutomationSitePage login = new LoginAutomationSitePage(DriverFactory.getDriver());

	@Given("user is on login page of practice automation site")
	public void user_is_on_login_page_of_practice_automation_site() {
		String pageTitle = login.getPageTitle();
		System.out.println("Page title found is: " + pageTitle);
		Assert.assertEquals(pageTitle, "My Account – Automation Practice Site");
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String userName, String pwd) {
		login.enterUserName(userName);
		login.enterPassword(pwd);
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() {
		login.clickLogin();
	}

	@Then("user is logged into the application")
	public void user_is_logged_into_the_application() {
		Assert.assertTrue(login.isOnLoginPage());
	}

	@Then("user is able to find {string} link")
	public void user_is_able_to_find_link(String string) {
		Assert.assertTrue(login.isLostPwdLinkPresent());
	}


}
