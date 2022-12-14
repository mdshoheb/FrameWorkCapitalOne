package baseUtil;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseClass {
	public WebDriver driver;
	public HomePage homePage;

	@BeforeMethod
	public void setUp() {
		// System.setProperty("webdriver.chrome.driver","/Users/mdshoheb/eclipse-workspace/com.capitalone/Driver/chromedriver");
		// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		// + "/Driver/chromedriver");
		// System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver");
		// driver = new FirefoxDriver();
		// System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.capitalone.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);
	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}
