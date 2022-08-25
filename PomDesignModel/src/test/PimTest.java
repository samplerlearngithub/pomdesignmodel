package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PimTest extends BaseTest{
	@BeforeClass
	public void login() {
		loginPage.loginmethod();;
	}
	@Test(priority=3)
	public void verifyPimPage() {
		Assert.assertEquals(pimPage.titleOfPage(), "PIM");
	}
	@Test(priority=4) 
	public void verifycheckboxIsSelected() {
		pimPage.selectedIdcheckBox();
		Assert.assertEquals(pimPage.verifycheckboxIsSelected(), false);
	}
	
}
