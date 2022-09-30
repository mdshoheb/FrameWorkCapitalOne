package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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

	@Test(enabled = false)
	public void logoPresent() {
		driver.get("https://www.walgreens.com/");
		boolean lDisplayed = driver.findElement(By.xpath("//img[@alt='Walgreens: Trusted since 1901']")).isDisplayed();
		System.out.println("Is logo displayed? " + lDisplayed);
	}

	@Test(enabled = false)
	public void checkBoxTest() throws InterruptedException {
		boolean cBox = driver.findElement(By.id("rememberMe")).isSelected();
		Thread.sleep(5000);
		System.out.println("Is checkbox selected? Ans: " + cBox);

	}

	@Test(enabled = false)
	public void getTitle() {
		System.out.println("The title of the page is:" + driver.getTitle());
	}

	@Test(enabled = false)
	public void getText() {
		WebElement lGrow = driver.findElement(By.xpath("//span[contains(text(),'Learn')]"));
		System.out.println("The text for the web element is: " + lGrow.getText());

	}

	@Test(enabled = false)
	public void getCurrentUrl() throws InterruptedException {
		driver.findElement(By.id("forgotUnpw")).click();
		Thread.sleep(4000);
		System.out.println("The Current URL is: " + driver.getCurrentUrl());
	}

	@Test(enabled = false)
	public void getAttributeMethod() {
		String value1 = driver.findElement(By.xpath("//a[contains(text(),'Forgot Us')]")).getAttribute("id");
		String value2 = driver.findElement(By.xpath("//a[contains(text(),'Forgot Us')]")).getAttribute("class");
		String value3 = driver.findElement(By.xpath("//a[contains(text(),'Forgot Us')]"))
				.getAttribute("data-initial-value");
		String value4 = driver.findElement(By.xpath("//a[contains(text(),'Forgot Us')]")).getAttribute("href");
		System.out.println("the value of attribute id is: " + value1);
		System.out.println("the value of attribute class is: " + value2);
		System.out.println("the value of attribute data-initial-value is: " + value3);
		System.out.println("the value of attribute href is: " + value4);
	}

	@Test(enabled = false)
	public void sendKeysMethod() throws InterruptedException {
		driver.findElement(By.cssSelector("button#unav-l1-search")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='qt']")).sendKeys("credit cards", Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='search-input']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("savings account", Keys.RETURN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='search-input']")).clear();
	}

	@Test(enabled = false)
	public void specificWindowSize() throws InterruptedException {
		Dimension dimension = new Dimension(700, 500);
		driver.manage().window().setSize(dimension);
		driver.manage().deleteAllCookies();
		driver.get("https://www.chase.com/");
		Thread.sleep(4000);
		System.out.println("The size of the window is: " + driver.manage().window().getSize());
	}

	@Test(enabled = false)
	public void navigateMethod() throws InterruptedException {
		driver.navigate().to("https://www.chase.com/");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);

	}

}
