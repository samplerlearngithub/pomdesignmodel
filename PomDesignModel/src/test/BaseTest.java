package test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainJava.LoginPage;
import mainJava.PimPage;


  public class BaseTest{
	  public static WebDriver driver;
	  protected LoginPage loginPage;
	  protected PimPage pimPage;
@BeforeClass
    public void launchbrowser() throws InterruptedException{		
    WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().getPageLoadTimeout();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@BeforeClass
	public void pageObjects() {
		loginPage=new LoginPage(driver);
		pimPage= new PimPage (driver);
	}
	@AfterClass
	public void tearDownEnvirnment() {
		driver.quit();
	}
    }
	


