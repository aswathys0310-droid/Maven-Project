package test_package;

import org.testng.annotations.Test;

import base_package.Base_class;

public class Payment_Test extends Base_class {
	
	@Test(priority = 1)
	public void screenshot_verify() throws Exception
	{
		payment_obj.screenshot_method();
	}
	
	@Test(priority = 2)
	public void finish_verification()
	{
		payment_obj.finish_method();
	}

}
