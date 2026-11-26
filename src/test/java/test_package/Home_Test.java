package test_package;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_package.Base_class;

public class Home_Test extends Base_class
{
	
	@Test(priority = 1)
	public void textverify()
	{
		//loginobj.login_method("standard_user", "secret_sauce");	
		home_obj.textmthd();
		String productText = home_obj.textmthd();
		Assert.assertEquals(productText,"Products");
	}
	
	@Test(priority = 2)
	public void linkverify()
	{
		int linkcount = home_obj.linkmthd();
		System.out.println("Number of links---" + linkcount);
	}
	
	@Test(priority = 3)
	public void cartmthd()
	{
		home_obj.cartmthd();
	}
	

}
