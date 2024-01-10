package tests;

import org.testng.annotations.*;

import pages.LoginPage_HRM;

public class LoginPageTest extends BaseTest_HRM {
	
	public LoginPage_HRM lp;
	
	public void initObjects() {
		 lp = new LoginPage_HRM(driver);
	}
	
	@BeforeClass
	public void init() throws InterruptedException {
		launchBrowser();
		initObjects();
	}
  @Test (priority = 1)
  public void loginApp() throws InterruptedException {
	  lp.loginApplication();
	  Thread.sleep(2000);
  }
  
  @Test (priority = 2)
  public void clickOnLoginButton() throws InterruptedException {
	  lp.clickLoginButton();
	  Thread.sleep(2000);
  }
  
  @AfterClass
  public void closeBrowser() throws InterruptedException {
	  Thread.sleep(2000);
	  tearDown();
  }
}
