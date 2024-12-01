package common;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.common.io.Files;

import reports.Loggers;

public class CommonActions {

	WebDriver driver;

	// common method for click ()
	public static void clickElement(WebElement element) {
		try {
			element.click();
			Loggers.logTheTest(element + "<--------> has been clicked");
		} catch (NoSuchElementException | NullPointerException e) {
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage());
			// e.getMessage() and e.printStackTrace() give similar outcome
		}
	}

	// common method for sleep()
	public static void pause(long millis) {
		try {
			Thread.sleep(millis);
			Loggers.logTheTest("Sleeping ... zZz " + millis);
		} catch (InterruptedException e) {
			Loggers.logTheTest("Sleep interrupted because of ... " + e.getMessage());
		}
	}

	// common method for sendKeys()
	public static void inputText(WebElement element, String input) {
		try {
			element.sendKeys(input);
			Loggers.logTheTest(input + " <-----> has been put into <-----> " + element);
		} catch (NoSuchElementException | NullPointerException e) {
			Loggers.logTheTest(element + "<----------> has not been found becuase of ...\n" + e.getMessage());
		}
	}

	public static void elementDisplayed(WebElement element) {
		try {
			boolean flag = element.isDisplayed();
			Loggers.logTheTest(element + "<---------> is Displayed, " + flag);
		} catch (NoSuchElementException | NullPointerException e) {
			Loggers.logTheTest(element + "<----------> is not Displayed\n" + e.getMessage());
		}
	}

	public static void elementEnabled(WebElement element) {
		try {
			boolean flag = element.isEnabled();
			Loggers.logTheTest(element + "<---------> is Enabled, " + flag);
		} catch (NoSuchElementException | NullPointerException e) {
			Loggers.logTheTest(element + "<----------> is not Displayed\n" + e.getMessage());
		}
	}

	public static void elementSelected(WebElement element) {
		try {
			boolean flag = element.isSelected();
			Loggers.logTheTest(element + "<---------> is Selected, " + flag);
		} catch (NoSuchElementException | NullPointerException e) {
			Loggers.logTheTest(element + "<----------> is not Displayed\n" + e.getMessage());
		}
	}

	public static void verifyTitle(WebDriver driver, String expectedTitle) {
		try {
			String actualTitle = driver.getTitle();
			Loggers.logTheTest("Actual Title is : " + actualTitle + " ---> And Expected Title is :" + expectedTitle);
			Assert.assertEquals(actualTitle, expectedTitle, "Title doesn't match up");
		} catch (NullPointerException e) {
			Loggers.logTheTest("Driver is not initiated properly Or Title doesn't match up");
			Assert.fail();
		}

	}

	public static void verifyCurrentUrl(WebDriver driver, String expectedURL) {
		try {
			String currentURL = driver.getCurrentUrl();
			Loggers.logTheTest("Current URL : " + currentURL + ", Expected URL : " + expectedURL);
			Assert.assertEquals(currentURL, expectedURL, "Current URL is not correct");
		} catch (NullPointerException e) {
			Loggers.logTheTest("Driver is not initiated properly Or Current URL doesn't match");
			Assert.fail();
		}

	}

	public static void verifyTextOfTheWebElement(WebElement element, String expected) {
		try {
			String actual = element.getText();
			Loggers.logTheTest(element + " ---> Actual text : " + actual + ". Expected text : " + expected);
			Assert.assertEquals(actual, expected, "Text In the WebElement doesn't match");
		} catch (NoSuchElementException | NullPointerException e) {
			Loggers.logTheTest(element + "<----------> is not Displayed or Text doesn't match\n" + e.getMessage());
		}
	}

	public static void clearTextFromTheField(WebElement element) {
		try {
			element.clear();
			Loggers.logTheTest("The Text from the " + element + " ---> is cleared");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage());
			Assert.fail();
		}
	}

	// This is build ONLY for Enthrall IT
	public static void switchToChildWindow(WebDriver driver, WebElement hoverActionElemnt, WebElement element) {
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(hoverActionElemnt).build().perform();
			pause(3000);
			clickElement(element);
			Set<String> allWindowHandles = driver.getWindowHandles();
			Loggers.logTheTest("Total Windows Opened: " + allWindowHandles.size());
			// Extract Parent and child window from all window handles
			String parent = (String) allWindowHandles.toArray()[0];
			String child = (String) allWindowHandles.toArray()[1];
			driver.switchTo().window(child);
			Loggers.logTheTest(" The Window moved to --> " + child);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage());
			Assert.fail();
		}
	}

	public static void validationOfHeader(WebElement element, String expectedHeader) {
		try {
			String actualHeader = element.getText();
			Loggers.logTheTest(
					element + " ---> Actual Header : " + actualHeader + ". Expected Header : " + expectedHeader);
			Assert.assertEquals(actualHeader, expectedHeader, "Header doesn't match");
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + " : This element Not Found");
			Assert.fail();
		}

	}

	public static void validationOfSubHeader(WebElement element, String expectedSubHeader) {
		try {
			String actualSubHeader = element.getText();
			Loggers.logTheTest(element + " ---> Actual SubHeader : " + actualSubHeader + ". Expected SubHeader : "
					+ expectedSubHeader);
			Assert.assertEquals(actualSubHeader, expectedSubHeader, "SubHeader doesn't match");
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + " : This element Not Found");
			Assert.fail();
		}

	}

	public static void validationOfOtherHeader(WebElement element, String expectedOtherHeader) {
		try {
			String actualOtherHeader = element.getText();
			Loggers.logTheTest(element + " ---> Actual Other Header : " + actualOtherHeader
					+ ". Expected Other Header : " + expectedOtherHeader);
			Assert.assertEquals(actualOtherHeader, expectedOtherHeader, "Other Header doesn't match");
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + " : This element Not Found");
			Assert.fail();
		}

	}

	public static void selectElelementFromDropdownOnebyOne(WebElement element, List<WebElement> elements) {
		try {
			Select select = new Select(element);
			for (int i = 1; i < elements.size(); i++) {
				Loggers.logTheTest(elements.get(i).getText() + " is present in the dropdpwn");
				select.selectByIndex(i);
				pause(2000);
			}
			Loggers.logTheTest("Total Element: " + (elements.size() - 1) + " is present in the dropdown");
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + " : This element Not Found");
			Assert.fail();
		}
	}

	// drop down by selectByVisibleText() is used as common action
	public static void selectDropdown(WebElement element, String value) {
		try {
			Select select = new Select(element);
			select.selectByVisibleText(value);
			Loggers.logTheTest(value + " has been selected from the dropdown of ---> " + element);
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + " : This element Not Found");
			Assert.fail();
		}
	}

	public static void inputTextThenClickEnter(WebElement element, String input) {
		try {
			element.sendKeys(input, Keys.ENTER);
			Loggers.logTheTest(
					input + " <-----> has been put into <-----> " + element + " and then clicked by Enter Key");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage());
			Assert.fail();
		}
	}

	public static void inputTextThenClickReturn(WebElement element, String input) {
		try {
			element.sendKeys(input, Keys.RETURN);
			Loggers.logTheTest(
					input + " <-----> has been put into <-----> " + element + " and then clicked by Enter Key");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage());
			Assert.fail();
		}
	}

	public static void inputTextThenClickTab(WebElement element, String input) {
		try {
			element.sendKeys(input, Keys.TAB);
			Loggers.logTheTest(
					input + " <-----> has been put into <-----> " + element + " and then clicked by Enter Key");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Loggers.logTheTest(element + "<----------> has not been found\n" + e.getMessage());
			Assert.fail();
		}
	}
	
	public static void clickUsingJavascriptExecutor(WebDriver driver, WebElement element) {
		// JavascriptExecutor js = (JavascriptExecutor)driver; // instead of writing this 'js' object
		// we can write below way, (JavascriptExecutor)driver is "js"
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
		Loggers.logTheTest("JavascriptExecutor executing ..." + " arguments[0].click()" + " to click on element ---> " + element);
	}
	
	public static void inputTextUsingJavascriptExecutor(WebDriver driver, String script, WebElement element) {
		((JavascriptExecutor) driver).executeScript(script, element);
		Loggers.logTheTest("JavascriptExecutor executing ..." + script + " to input Text on element ---> " + element);
	}
	
	public static void scrollIntoViewTheElementUsingJavascriptExecutor(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
		Loggers.logTheTest("JavascriptExecutor executing ..." + " arguments[0].scrollIntoView(true)" + " to input Text on element ---> " + element);
	}	
	
	// This is for Enthrall IT photo upload common action, not needed for CMS
	public static void uploadPhotoImage(WebElement element, String location) {
		File file = new File(location);
		element.sendKeys(file.getAbsolutePath());
		pause(4000);
	}
	


	
}


	
	
