package mainJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class PimPage extends BaseTest{
@FindBy(xpath="//h6[text()='PIM']")
WebElement txtPage;

@FindBy (xpath="//i[contains(@class,'oxd-icon bi-check oxd-checkbox-input-icon')]")
List<WebElement>checkAll;

@FindBy (xpath="//input[@type='checkbox']")
List<WebElement>checkInput;


public PimPage(WebDriver driver) {
	this.driver=driver; 
	PageFactory.initElements(driver,this);
}	
	public String titleOfPage() {
		return txtPage.getText();
	}
public boolean verifycheckboxIsSelected() {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return checkInput.get(0).isSelected();
}
public void selectedIdcheckBox() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	checkAll.get(0).click();
}
}
