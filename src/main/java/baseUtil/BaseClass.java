package baseUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseClass {
	WebDriver driver;
	public HomePage homePage;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/mdshoheb/eclipse-workspace/com.capitalone/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.capitalone.com/");
		homePage = new HomePage(driver);
	}
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	

}
