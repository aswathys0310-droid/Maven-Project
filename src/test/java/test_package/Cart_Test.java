package test_package;

import org.testng.Assert;
import org.testng.annotations.Test;
import base_package.Base_class;

public class Cart_Test extends Base_class {
	
	@Test(priority = 1)
	public void cart_verification()
	{
		cart_obj.cart_icon_mthd();
	}
	
	@Test(priority = 2)
	public void text_verification()
	{
		String text = cart_obj.txt_mthd();
		Assert.assertEquals(text,"Your Cart");
	}
	
	@Test(priority = 3)
	public void checkout_verification()
	{
		cart_obj.checkout_method();
	}
	
	
	

}
