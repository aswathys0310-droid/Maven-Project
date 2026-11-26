package page_package;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")WebElement products;
	@FindBy(tagName = "a") List<WebElement> links;
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]") WebElement Addtocart;
	
	public Home_Page(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String textmthd()
	{
		String ActualText = products.getText();
		return ActualText;
	}
	
	public int linkmthd()
	{
		int count = links.size();
		return count;
	}
	
	public void cartmthd()
	{
		Addtocart.click();
	}

}
