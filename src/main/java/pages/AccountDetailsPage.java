package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage {

	private WebDriver driver;

	private By firstName = By.id("account_first_name");
	private By LastName = By.id("account_last_name");
	private By saveChanges = By.name("save_account_details");

	public AccountDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isFirstNamePresent() {
		return driver.findElement(firstName).isDisplayed();
	}

	public void enterFirstName(String fName) {
		driver.findElement(firstName).clear();
		driver.findElement(firstName).sendKeys(fName);
	}

	public void enterLastName(String lName) {
		driver.findElement(LastName).clear();
		driver.findElement(LastName).sendKeys(lName);
	}

	public void clickOnSaveChanges() {
		driver.findElement(saveChanges).click();
	}

	
	public MyAccountMenuPage returnToMyAccountMenuPage() {
		return new MyAccountMenuPage(driver);
	}

	
}
