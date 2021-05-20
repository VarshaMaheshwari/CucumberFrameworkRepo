package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountMenuPage {

	private WebDriver driver;

	private By accountDetails = By.linkText("Account Details");
	private By firstNameLable = By.xpath("//label[text()='First name ']");
	private By userDetails=By.xpath("//strong[text()='varshan1311']");
	
	public MyAccountMenuPage(WebDriver driver) {

		this.driver = driver;
	}

	public boolean isOnMyAccountMenuPage() {
		return driver.findElement(userDetails).isDisplayed();
	}
	
	public boolean isAccountDetailsLinkPresent() {
		return driver.findElement(accountDetails).isDisplayed();
	}

	public AccountDetailsPage clickOnAccountDetailsLink() {
		driver.findElement(accountDetails).click();
		return new AccountDetailsPage(driver);
	}

//	public AccountDetailsPage isOnAccountDetailsScreen() {
//		driver.findElement(firstNameLable).isDisplayed();
//		
//	}

}
