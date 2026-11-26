package base_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import page_package.Cartpage;
import page_package.Checkout_page;
import page_package.Home_Page;
import page_package.Login_page;
import page_package.Payment_page;


public class Base_class {
	
	public static WebDriver driver;
	public Login_page login_obj ;
	public Home_Page home_obj;
	public Cartpage cart_obj;
	public Checkout_page checkout_obj;
	public Payment_page payment_obj;
	
	
	@BeforeTest
	public void browser_setup()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void object_method()
	{
		login_obj = new Login_page(driver);
		home_obj = new Home_Page(driver);
		cart_obj = new Cartpage(driver);
		checkout_obj = new Checkout_page(driver);
		payment_obj = new Payment_page(driver);
	}

}
