package pages;

import static org.testng.Assert.assertThrows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	WebDriver driver;

	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "logo-link")
	WebElement logoElement;

	@FindBy(name = "username")
	WebElement userIdElement;

	@FindBy(xpath = "//li[@id='courses' and @name='courses']")
	WebElement coursesElement;

	@FindBy(xpath = "//li[@id='about us' and @name='about us']")
	WebElement aboutusElement;

	@FindBy(xpath = "//li[@id='mentors' and @name='mentors']")
	WebElement mentorsElement;

	@FindBy(id = "login-link")
	WebElement loginElement;

	@FindBy(id = "enroll-button")
	WebElement enrollElement;

	@FindBy(xpath = "//input[@id='emails' and @class='form-control form-control-lg']")
	WebElement useremailElement;

	public void clickLogo() throws InterruptedException {
		Thread.sleep(4000);
		logoElement.click();
		Thread.sleep(4000);
		logoElement.click();
	}

	// Will Work With More Web Element.

	// public void clickUserId() {
	// userIdElement.click();

	// }

	public void clickUserEmail() throws InterruptedException {
		Thread.sleep(4000);
		useremailElement.click();
		Thread.sleep(4000);
		useremailElement.click();

	}

	public void clickAboutUs() throws InterruptedException {
		Thread.sleep(4000);
		aboutusElement.click();
		Thread.sleep(4000);
		aboutusElement.click();

	}

	public void clickLogin() throws InterruptedException {
		Thread.sleep(4000);
		loginElement.click();
		Thread.sleep(4000);
		loginElement.click();

	}

	public void clickCourses() throws InterruptedException {
		Thread.sleep(5000);
		coursesElement.click();
		Thread.sleep(5000);
		coursesElement.click();
	}

	public void clickMentors() throws InterruptedException {
		Thread.sleep(5000);
		mentorsElement.click();
		Thread.sleep(5000);
		mentorsElement.click();
	}

	public void clickEnroll() throws InterruptedException {
		Thread.sleep(6000);
		enrollElement.click();
		Thread.sleep(6000);
		enrollElement.click();

	}

}
