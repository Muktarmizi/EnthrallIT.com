package pages;

import static common.CommonActions.*;
import static org.testng.Assert.assertThrows;

import java.util.List;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;
import reports.Loggers;

import static common.CommonActions.*;
import static common.CommonActions.*;

import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver;

	public Select select;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id='logo-id' and @name='logo-link']")
	WebElement logoElement;

	@FindBy(xpath = "//li[@id='courses' and @name='courses']")
	WebElement coursesElement;

	@FindBy(xpath = "//li[@id='about us' and @name='about us']")
	WebElement aboutusElement;

	@FindBy(xpath = "//li[@id='mentors' and @name='mentors']")
	WebElement mentorsElement;

	@FindBy(id = "login-link")
	WebElement loginElement;

	@FindBy(xpath = "//*[@id='emails' and @class='form-control form-control-lg']")
	WebElement userIdElement;

	@FindBy(id = "enroll-button")
	WebElement enrollElement;

	@FindBy(xpath = "//input[@id='emails' and @class='form-control form-control-lg']")
	WebElement useremailElement;

	@FindBy(xpath = "//*[@id='password' and @class='form-control form-control-lg']")
	WebElement userpassElement;

	@FindBy(xpath = "//*[@id='login' and@class='btn btn-lg px-5']")
	WebElement loginbuttonElement;

	/*
	 * @FindBy(css = "button.btn.btn-info.btn-block") WebElement returnsitElement;
	 * 
	 * 
	 * //@FindBy(xpath ="//*[@class='submenu active']") //WebElement
	 * classnotElement;
	 */

	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automationElement;

	@FindBy(xpath = "//button[text()='Mouse Hover Action']")
	WebElement mouseHoverElement;

	@FindBy(xpath = "//a[text()='Enroll Now']")
	WebElement enroll;

	@FindBy(xpath = "//input[@name='f_name']")
	WebElement firstnameElement;

	@FindBy(xpath = "//input[@name='m_name']")
	WebElement middElement;

	@FindBy(xpath = "//input[@name='l_name' and @class='form-control']")
	WebElement lastElement;

	@FindBy(xpath = "//select[@name='i_am']")
	WebElement selectProfession;

	@FindBy(xpath = "//select[@id='id_i_am']/option")
	List<WebElement> selecProfessionList;

	@FindBy(xpath = "//*[@name='course_wish_to_enroll' and @class='form-control']")
	WebElement selectCourse;
	@FindBy(xpath = "//*[@name='course_wish_to_enroll' and @class='form-control']/option")
	List<WebElement> selectCourseList;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement phoneNum;

	@FindBy(xpath = "//input[@id='id_email' and @name='email']")
	WebElement emailAdd;

	@FindBy(xpath = "//input[@id='id_password']")
	WebElement passWordAdd;

	@FindBy(xpath = "//select[@id='id_gender']")
	WebElement Gender;

	// @FindBy(xpath = "//option[text()='Select Birth Year']")
	// WebElement birthYear;

	@FindBy(xpath = "//select[@name='birth_year']")
	WebElement selectBirthYear;

	@FindBy(xpath = "//select[@name='birth_month']/option")
	List<WebElement> selectBirthMonthList;

	@FindBy(xpath = "//select[@name='birth_month']")
	WebElement selectBirthMonth;

	@FindBy(xpath = "//select[@name='birth_date']")
	WebElement selectBirthDay;

	@FindBy(xpath = "//*[@name='image' and @class='form-control error-border']")
	WebElement choosefile1;

	@FindBy(xpath = "//input[@name='home_address_line_1']")
	WebElement homeAddressL1;

	@FindBy(xpath = "//input[@name='home_address_line_2']")
	WebElement homeAddressL2;

	@FindBy(xpath = "//input[@id='id_city']")
	WebElement cityElement;

	@FindBy(xpath = "//select[@id='id_state']")
	WebElement stateElement;

	@FindBy(xpath = "//input[@name='zip_code']")
	WebElement zipCodElement;

	@FindBy(xpath = "//select[@name='immigration_status']")
	WebElement immigrationElement;

	@FindBy(xpath = "//select[@name='immigration_status']/option")
	List<WebElement> immigrationList;

	@FindBy(xpath = "//input[@name='arrival_date']")
	WebElement arrivalDateElement;

	@FindBy(xpath = "//input[@id='id_emergency_contact']")
	WebElement emergencyElement;

	@FindBy(xpath = "//input[@id='id_know_us']")
	WebElement knowAboutUs;

	@FindBy(xpath = "//select[@id='id_highest_education']")
	WebElement highEducation;

	@FindBy(xpath = "//select[@id='id_country_of_origin']")
	WebElement countryOriginElement;

	@FindBy(xpath = "//select[@id='id_primary_language']/option")
	List<WebElement> selectlanguageList;

	@FindBy(xpath = "//select[@id='id_primary_language']")
	WebElement selectLanguage;

	@FindBy(xpath = "//input[@id='id_sign_by_name']")
	WebElement signtureElement;

	@FindBy(xpath = "//input[@id='is_agree']")
	WebElement iAgreeCheckBox;

	@FindBy(xpath = "//button[@id='submit_button']")
	WebElement submitButton;

	public void logoElement() {
		clickElement(logoElement);
		pause(2000);
	}

	public void clickAutomationEnrollNow() {

		pause(2000);
		clickElement(loginElement);
		pause(2000);
		useremailElement.clear();
		useremailElement.sendKeys("Mizimuktar0@gmail.com");
		pause(2000);
		clickElement(useremailElement);
		pause(2000);
		userpassElement.clear();
		userpassElement.sendKeys("Password$1");
		pause(2000);
		clickElement(userpassElement);
		pause(2000);

		pause(2000);
		clickElement(loginbuttonElement);
		pause(3000);
		clickElement(automationElement);
		pause(2000);
		switchToChildWindow(driver, mouseHoverElement, enroll);
		pause(2000);
		clickElement(firstnameElement);
		pause(2000);
		inputTextThenClickTab(firstnameElement, "Shuvo");
		pause(2000);
		// firstnameElement.sendKeys("Shuvo");
		inputTextThenClickTab(middElement, "M");
		pause(2000);
		inputText(lastElement, "Mirza");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectProfession, selecProfessionList);
		pause(2000);
		selectDropdown(selectProfession, "a Student");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectCourse, selectCourseList);
		pause(2000);
		selectDropdown(selectCourse, "Python");
		pause(2000);
		inputTextThenClickTab(phoneNum, "9293306564");
		pause(2000);
		inputTextThenClickTab(emailAdd, "MirzaShuvo79@gmail.com");
		pause(2000);
		inputTextThenClickTab(passWordAdd, "Muktar2024$");
		pause(2000);
		selectDropdown(Gender, "Male");
		pause(2000);
		getScreenShot("/com.Enthrallit.portal/other/Screenshot 2024-11-02 105059.png", driver);
		pause(2000);
		selectDropdown(selectBirthYear, "1989");
		pause(2000);
		// selectElelementFromDropdownOnebyOne(selectBirthMonth, selectBirthMonthList);
		// pause(2000);
		selectDropdown(selectBirthMonth, "December");
		pause(2000);
		inputTextThenClickTab(selectBirthDay, "16");
		pause(2000);
		inputTextThenClickTab(homeAddressL1, "2268 Seward Ave");
		pause(2000);
		inputTextThenClickTab(homeAddressL2, "Apt 3");
		pause(2000);
		inputTextThenClickTab(cityElement, "Bronx");
		pause(2000);
		inputTextThenClickTab(stateElement, "New York");
		pause(2000);
		inputTextThenClickTab(zipCodElement, "10473");
		pause(2000);
		inputTextThenClickTab(immigrationElement, "Citizen");
		pause(2000);
		inputTextThenClickTab(arrivalDateElement, "24th Jan 2013");
		pause(2000);
		inputTextThenClickTab(emergencyElement, "9293306564");
		pause(2000);
		inputTextThenClickTab(knowAboutUs, "Friends");
		pause(2000);
		inputTextThenClickTab(highEducation, "Graduate");
		pause(2000);
		inputTextThenClickTab(countryOriginElement, "Bangladesh");
		pause(2000);
		inputTextThenClickTab(selectLanguage, "English");
		pause(2000);
		inputTextThenClickTab(signtureElement, "Shuvo");
		pause(2000);
		clickElement(iAgreeCheckBox);
		pause(2000);
		submitButton.click();

	}

	/*
	 * Select select1 = new Select(selectCourse); pause(2000);
	 * select.selectByVisibleText("python"); pause(2000);
	 * inputText(phoneNum,"929-330-6564"); pause(2000);
	 * inputTextThenClickTab(emailAdd, "Mirzashuvo79@gmail.com"); pause(2000);
	 * inputTextThenClickTab(passWordAdd, "Mirza2024"); pause(2000);
	 * elementSelected(Gender); pause(2000); select.selectByVisibleText("Male");
	 * pause(2000); //selectElelementFromDropdownOnebyOne(student, null);
	 * pause(2000); elementEnabled(student); pause(2000); selectDropdown(selectIm,
	 * "Student"); // selectElelementFromDropdownOnebyOne(selectIm, null);
	 * pause(2000); selectDropdown(selectCourse, "Python"); pause(2000);
	 * inputTextThenClickTab(phoneNum, "929-330-6564"); pause(2000);
	 * inputTextThenClickTab(emailAdd, "Mirzashuvo79@gmail.com"); pause(2000);
	 * inputTextThenClickTab(passWordAdd, "Mirza2024"); pause(2000);
	 * 
	 * 
	 * selectDropdown(Gender,"Male"); pause(2000); //inputTextThenClickEnter(
	 * aboutusElement,"/com.Enthrallit.portal/other/Screenshot 2024-11-02 105059.png"
	 * ); pause(2000);
	 */

	public void clickAboutUs() throws InterruptedException {
		Thread.sleep(2000);
		aboutusElement.isDisplayed();
		Thread.sleep(2000);
		aboutusElement.click();

	}

	public void clickLogin() throws InterruptedException {
		Thread.sleep(2000);
		loginElement.click();
		Thread.sleep(2000);
		loginElement.click();

	}

	public void clickCourses() throws InterruptedException {
		Thread.sleep(2000);
		coursesElement.click();
		Thread.sleep(2000);
		coursesElement.click();
	}

	public void clickMentors() throws InterruptedException {
		Thread.sleep(2000);
		mentorsElement.click();
		Thread.sleep(2000);
		mentorsElement.click();
	}

	public void clickEnroll() throws InterruptedException {
		Thread.sleep(2000);
		enrollElement.click();
		Thread.sleep(2000);
		enrollElement.click();

	}

	public void clickAutomation() {
		pause(2000);
		clickElement(automationElement);
		pause(2000);

	}

}
