package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginAutomationSitePage {
	
	
	private WebDriver driver;
	
	//1.BY locators
	private By userName=By.id("username");
	private By password=By.id("password");
	private By login=By.name("login");
	private By userDetails=By.xpath("//strong[text()='varshan1311']");
	private By lostPwdLinnk=By.linkText("Lost your password454353");
	//2.constructor of the page class
	
	public LoginAutomationSitePage(WebDriver driver) {

		this.driver = driver;
	}
	
	//3. page actions: features(behaviors) of the page in the form of methods
	public String getPageTitle() {
		return driver.getTitle();
		
	}
	
	public void enterUserName(String un) {
		 driver.findElement(userName).sendKeys(un);
	}
	
	public void enterPassword(String pwd) {
		 driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLogin() {
		 driver.findElement(login).click();
	}
	
	public boolean isOnLoginPage() {
		return driver.findElement(userDetails).isDisplayed();
	}
	
	public boolean isLostPwdLinkPresent() {
		return driver.findElement(lostPwdLinnk).isDisplayed();
	}
	
	public MyAccountMenuPage doLogin(String uname, String pswd) {
		 driver.findElement(userName).sendKeys(uname);
		 driver.findElement(password).sendKeys(pswd);
		 driver.findElement(login).click();
		 return new MyAccountMenuPage(driver);
	}
	

}
