package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage_HRM {

	public WebDriver driver;
	
	@FindBy (xpath= "(//li[@class='oxd-main-menu-item-wrapper'])[1]")
	private WebElement AdminModule;
	
	@FindBy (xpath= "(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")
	private WebElement Job;	
	
	@FindBy (xpath= "//a[text()='Job Titles']")
	private WebElement JobTitle;	
	
	
	
	@FindBy (xpath= "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']")
	private WebElement RecordsFound;
	
	
	public HomePage_HRM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void openAdmin() {
		AdminModule.click();
	}
	
	public void jobInformation() throws InterruptedException {
		Job.click();
		Thread.sleep(2000);		
		JobTitle.click();	
		Thread.sleep(2000);	
	}
	
	public void Records() throws InterruptedException {
		String RecordText = RecordsFound.getText();
		System.out.println("Records Text : " + RecordText);
		Thread.sleep(2000);	
	}		
}
