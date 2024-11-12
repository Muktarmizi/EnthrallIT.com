package basicutil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.Home_Page;

public class Basic_Class {

	public WebDriver driver;

	public Home_Page home_Page;

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mizim\\eclipse-workspace\\com.Enthrallit.portal\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://enthrallit.com/");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		home_Page = new Home_Page(driver);
	}

	@AfterMethod
	public void tearUp() {
		// driver.quit();
	}

}
