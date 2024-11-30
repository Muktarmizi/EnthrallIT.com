package allPageTestIng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import basicutil.BasicClass;

public class HomePageTesting extends BasicClass {

	@Test
	public void clickAutomationEnrollNowtest() {
		homePage.clickAutomationEnrollNow();

	}

	@Test
	public void clickAboutUsTest() throws InterruptedException {
		homePage.clickAboutUs();

	}

	@Test
	public void clickLoginTest() throws InterruptedException {
		homePage.clickLogin();
	}

	@Test
	public void clickCoursesTest() throws InterruptedException {
		homePage.clickCourses();

	}

	@Test
	public void clickLogoTest() {
		homePage.logoElement();
	}

	@Test
	public void clickMentoresTest() throws InterruptedException {
		homePage.clickMentors();
	}

	@Test
	public void clickEnrollTest() throws InterruptedException {
		homePage.clickEnroll();

	}

}
