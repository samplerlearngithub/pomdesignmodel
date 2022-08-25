package mainJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {
	

	@FindBy (xpath="//*[@name='username']")
	WebElement username;

	@FindBy (xpath="//*[@name='password']")
	WebElement password;

	@FindBy (xpath="//* [text()=' Login ']")
	WebElement btnlogin;

	@FindBy (xpath="//h5[text()='Employee Information']")
	WebElement txtloginPage;
	
	

	public LoginPage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void loginmethod() {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
	    btnlogin.click();
	}
public String TitleLoginPage() {
	return txtloginPage.getText();
}

public String currentUrl() {
	return driver.getCurrentUrl();
}
		
	}	 


