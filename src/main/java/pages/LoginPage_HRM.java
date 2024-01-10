package pages;
//This is a Login Page of Orange HRM
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_HRM {

	public WebDriver driver;
	
	@FindBy (xpath ="//input[@name='username']")
	private WebElement username;
	
	@FindBy (xpath ="//input[@name='password']")
	private WebElement password;
	
	@FindBy (xpath ="//button[@type='submit']")
	private WebElement loginButton;
	
	public LoginPage_HRM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginApplication() {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		System.out.println("Username & Password entered Successfully");
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
}
