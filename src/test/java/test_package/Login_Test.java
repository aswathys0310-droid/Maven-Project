package test_package;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base_package.Base_class;

public class Login_Test extends Base_class {
	
	@Test(priority = 1)
	public void title_verification_mthd()
	{
		String actual_title = login_obj.title_method();
		Assert.assertEquals(actual_title, "Swag Labs");
	}
	
	@Test(priority = 2)
	public void login_validation_mthd()
	{
		login_obj.login_method("standard_user", "secret_sauce");	// call the login method before executing home page method
	}
	
	@Test(priority = 3)
	public void urlvalidation()
	{
		String Homeurl = login_obj.urlmthd();
		System.out.println(Homeurl);
		// Assert.assertEquals(Homeurl, "https://www.saucedemo.com/inventory.html");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
	}

}
