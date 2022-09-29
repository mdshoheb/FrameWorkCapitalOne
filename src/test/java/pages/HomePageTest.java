package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = false, priority = 6)
	public void logoTest() {
		homePage.logoDisplayed();
	}

	@Test(enabled = false, priority = 5)
	public void signInButtonClickedTest() throws InterruptedException {
		homePage.signInButtonClicked();
	}

	@Test(enabled = false, priority = 1)
	public void forGotUserNameClickedTest() throws InterruptedException {
		homePage.forGotUserNameClicked();
	}

	@Test(enabled = false, priority = 2)
	public void searchButtonClickedTest() throws InterruptedException {
		homePage.searchButtonClicked();
	}

	@Test(enabled = false, priority = 4)
	public void checkingAndSavingsButtonClickedTest() throws InterruptedException {
		homePage.checkingAndSavingsButtonClicked();
	}

	@Test(enabled = false, priority = 3)
	public void setUpOnlineAccessClickedTest() throws InterruptedException {
		homePage.setUpOnlineAccessClicked();
	}

	@Test(enabled = false)
	public void signInButtonTest() throws InterruptedException {
		driver.findElement(By.id("noAcctSubmit")).click();
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void userFieldClickTest() throws InterruptedException {
		driver.findElement(By.name("ods-input-0")).click();
		Thread.sleep(4000);

	}

	@Test(enabled = false)
	public void searchFieldTest() throws InterruptedException {
		driver.get("https://www.walgreens.com/");
		driver.findElement(By.className("blue-shadow")).click();
		Thread.sleep(3000);
	}

	@Test(enabled = false)
	public void learnAndGrowButtonTest() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Learn & Grow']")).click();
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void privacyLinkTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(5000);

	}

	@Test(enabled = false)
	public void termsAndConditionPlinkTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Terms & C")).click();
		Thread.sleep(5000);
	}

	@Test(enabled = false)
	public void searchIconClickTest() throws InterruptedException {
		driver.findElement(By.cssSelector("button#unav-l1-search")).click();
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void helpCenterIconClickTest() throws InterruptedException {
		driver.findElement(By.cssSelector("a.site-header__navlink.site-utility-nav__help-center.ng-star-inserted"))
				.click();
		Thread.sleep(5000);
	}

	@Test(enabled = false)
	public void signIntest() throws InterruptedException {
		driver.findElement(By.cssSelector("button[name='noAcctSubmit']")).click();
		Thread.sleep(4000);
	}

	@Test(enabled = false)
	public void seeSuggestionsButtonEnabled() throws InterruptedException {
		boolean suggestionB = driver.findElement(By.xpath("//button[contains(@class,'guidance__button grv-s')]"))
				.isEnabled();
		System.out.println("Is suggestions button Enabled? " + suggestionB);
		Thread.sleep(3000);
	}

	@Test(enabled = true)
	public void logoPresent() {
		driver.get("https://www.walgreens.com/");
		boolean lDisplayed = driver.findElement(By.xpath("//img[@alt='Walgreens: Trusted since 1901']")).isDisplayed();
		System.out.println("Is logo displayed? " + lDisplayed);
	}

}
