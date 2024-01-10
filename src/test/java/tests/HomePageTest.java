package tests;

import org.testng.annotations.*;

import pages.HomePage_HRM;
import pages.LoginPage_HRM;

public class HomePageTest extends BaseTest_HRM {
	public LoginPage_HRM lp;
	public HomePage_HRM hp;
	
	public void initObjects() {
		hp=new HomePage_HRM(driver);
		lp=new LoginPage_HRM(driver);
		
	}
	
	@BeforeClass
	public void init() throws InterruptedException {
		launchBrowser();
		initObjects();
	}
	
  @Test (priority=1)
  public void loginApp1() throws InterruptedException {
	  lp.loginApplication();
	  Thread.sleep(2000);
	  lp.clickLoginButton();
	  Thread.sleep(2000);
  }
  
  @Test (priority=2)
  public void openAdminModule() throws InterruptedException {
	  Thread.sleep(2000);
	  hp.openAdmin();
	  Thread.sleep(2000);
	  System.out.println("Successfully open Admin Module");
  }
  
  @Test (priority=3)
  public void jobData() throws InterruptedException {
	  Thread.sleep(2000);
	  hp.jobInformation();
	  Thread.sleep(2000);
	  System.out.println("Successully shows jos Information");
  }
  
  @Test (priority=4)
  public void getRecordValue() throws InterruptedException {
	  Thread.sleep(2000);
	  hp.Records();
	  Thread.sleep(2000);
	  System.out.println("Successfully shows records");
  }
  
  @AfterClass
  public void closeBrowser() throws InterruptedException {
	  Thread.sleep(2000);
	  tearDown();
  }
}
