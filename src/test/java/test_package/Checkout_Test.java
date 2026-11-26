package test_package;

import org.testng.annotations.Test;

import base_package.Base_class;

public class Checkout_Test extends Base_class{
	
	@Test(priority = 1)
	public void checkout_verification() throws Exception
	{
		checkout_obj.checkout_mthd("abcd","m","1234");
	}

}
