package pages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = true, priority = 6)
	public void logoTest() {
		homePage.logoDisplayed();
	}

	@Test(enabled = true, priority = 5)
	public void signInButtonClickedTest() throws InterruptedException {
		homePage.signInButtonClicked();
	}

	@Test(enabled = true, priority = 1)
	public void forGotUserNameClickedTest() throws InterruptedException {
		homePage.forGotUserNameClicked();
	}

	@Test(enabled = true, priority = 2)
	public void searchButtonClickedTest() throws InterruptedException {
		homePage.searchButtonClicked();
	}

	@Test(enabled = true, priority = 4)
	public void checkingAndSavingsButtonClickedTest() throws InterruptedException {
		homePage.checkingAndSavingsButtonClicked();
	}

	@Test(enabled = true, priority = 3)
	public void setUpOnlineAccessClickedTest() throws InterruptedException {
		homePage.setUpOnlineAccessClicked();
	}

}
