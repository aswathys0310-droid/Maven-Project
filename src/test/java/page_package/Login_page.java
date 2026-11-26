package page_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	WebDriver driver;
	
	@FindBy (xpath = "//*[@id=\"user-name\"]") WebElement username;
	@FindBy(xpath = "//*[@id=\"password\"]") WebElement password;
	@FindBy(xpath = "//*[@id=\"login-button\"]") WebElement login_button;
	
	public Login_page(WebDriver driver)  // constructor
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String title_method() //method
	{
		String title = driver.getTitle();
		return title;
	}
	
	public void login_method(String un, String pwd) //methods
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		login_button.click();
	}
	
	public String urlmthd()
	{
		String Actualurl = driver.getCurrentUrl();
		return Actualurl;
	}

}
