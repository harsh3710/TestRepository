package webdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testwebdriver {

	sendmail obj=new sendmail();
	@Test
	public void testnavigation()
	{
		obj.navigate();
	}
	@Test 
	//@Parameters("'id','psswrd'")
	public void testuserdetails()
	//public void testuserdetails(String id, String psswrd)
	{
	//	obj.logindetails("harshagarwal@qainfotech.net", "H@r$h");
	}
	@Test (dependsOnMethods={"testuserdetails"})
	public void login()
	{obj.login();}
}
