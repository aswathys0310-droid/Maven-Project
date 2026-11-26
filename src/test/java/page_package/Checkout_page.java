package page_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_page {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"first-name\"]")WebElement firstname;
	@FindBy(xpath="//*[@id=\"last-name\"]")WebElement lastname;
	@FindBy(xpath="//*[@id=\"postal-code\"]")WebElement postalcode;
	@FindBy(xpath="//*[@id=\"continue\"]")WebElement continuebtn;
	

	public Checkout_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	public void checkout_mthd(String fn,String ln,String pc) throws Exception
	{
		Thread.sleep(2000);

		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		postalcode.sendKeys(pc);
		continuebtn.click();
	}
}
