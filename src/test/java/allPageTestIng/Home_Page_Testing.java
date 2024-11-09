package allPageTestIng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import basicutil.Basic_Class;

public class Home_Page_Testing extends Basic_Class {

	@Test
	public void clickLogoTest() throws InterruptedException {
		home_Page.clickLogo();

	}

	@Test
	public void clickUserIdTest() {
		home_Page.clickUserId();

	}

}
