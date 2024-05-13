package pagepkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class SauceDemoPage {
	
	ChromeDriver driver;
	@FindBy(id = "user-name")
	WebElement sauceid;
	@FindBy(id = "password")
	WebElement saucepswd;
	@FindBy(id = "login-button")
	WebElement saucelogin;
	
	

}
