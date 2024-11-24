package basicutil;

import static utils.IConstant.*;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.Configuration;
import static utils.IConstant.*;

import static utils.IConstant.*;
import static utils.IConstant.*;

public class BasicClass {

	public WebDriver driver;

	public HomePage homePage;

	Configuration configuration;

	@BeforeMethod
	public void setup() {
		configuration = new Configuration();
		initDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(configuration.getProperties(URL));
		long pageLoadWait = Long.parseLong(configuration.getProperties(PAGELOAD_WAIT));
		long implicitlyWait = Long.parseLong(configuration.getProperties(IMPLICITLY_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
		initClass();
	}

	public void initDriver() {
		String browserName = configuration.getProperties(BROWSER);
		switch (browserName) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\mizim\\eclipse-workspace\\com.Enthrallit.portal\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		/*
		 * case FIREFOX: System.setProperty("webdriver.gecko.driver",
		 * "./driver/geckodriver.exe"); driver = new FirefoxDriver(); break;
		 * 
		 * case EDGE: System.setProperty("webdriver.edge.driver",
		 * "./driver/msedgedriver.exe"); driver = new EdgeDriver(); break;
		 */

		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();

		default:
			break;
		}
	}

	public void initClass() {
		homePage = new HomePage(driver);

	}

	@AfterMethod
	public void tearUp() {
		// driver.quit();
	}

}
