package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='unav-l1-logo']")
	WebElement logo;
	@FindBy(xpath = "//button[@id='noAcctSubmit']")
	WebElement signIn;
	@FindBy(xpath = "//a[@id='forgotUnpw']")
	WebElement forgotUserName;
	@FindBy(xpath = "//button[@id='unav-l1-search']")
	WebElement search;
	@FindBy(xpath = "//span[text()='Checking & Savings']")
	WebElement checkingAndSavings;
	@FindBy(how = How.XPATH, using = "//a[@id='setUpAccess']")
	WebElement setUpOnlineAccess;

	public boolean logoDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("Is logo displayed? " + flag);
		return flag;
	}

	public void signInButtonClicked() throws InterruptedException {
		signIn.click();
		Thread.sleep(5000);
	}

	public void forGotUserNameClicked() throws InterruptedException {
		forgotUserName.click();
		Thread.sleep(5000);

	}

	public void searchButtonClicked() throws InterruptedException {
		search.click();
		Thread.sleep(5000);
	}

	public void checkingAndSavingsButtonClicked() throws InterruptedException {
		checkingAndSavings.click();
		Thread.sleep(5000);
	}

	public void setUpOnlineAccessClicked() throws InterruptedException {
		setUpOnlineAccess.click();
		Thread.sleep(5000);

	}

}
