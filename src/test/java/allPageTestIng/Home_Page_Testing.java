package allPageTestIng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import basicutil.Basic_Class;

public class Home_Page_Testing extends Basic_Class {

	@Test
	public void clickLogoTest() throws InterruptedException {
		home_Page.clickLogo();

	}

	// @Test
	// public void clickUserIdTest() {
	// home_Page.clickUserId();

	// }

	@Test
	public void clickUserEmailandPasswordTest() throws InterruptedException {
		home_Page.clickUserEmailandPassword();
	}

	@Test
	public void clickAboutUsTest() throws InterruptedException {
		home_Page.clickAboutUs();

	}

	@Test
	public void clickLoginTest() throws InterruptedException {
		home_Page.clickLogin();
	}

	@Test
	public void clickCoursesTest() throws InterruptedException {
		home_Page.clickCourses();

	}

	@Test
	public void clickMentoresTest() throws InterruptedException {
		home_Page.clickMentors();
	}

	@Test
	public void clickEnrollTest() throws InterruptedException {
		home_Page.clickEnroll();

	}

}
