package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	WebDriver driver;

	
		
	    public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(name ="logo-link")
	WebElement logoElement;

	
	@FindBy (name = "username")
     WebElement userIdElement;
	
     public void clickLogo() throws InterruptedException {
    	 Thread.sleep(4000);
    	 logoElement.click();
    	 Thread.sleep(4000);
    	 logoElement.click();

	}
     
     public void clickUserId() {
    	 userIdElement.click();
    	 
     }

	
}
