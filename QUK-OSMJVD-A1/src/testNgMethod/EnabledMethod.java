package testNgMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledMethod {
	
	@Test(enabled = false)
	public void login() {
		Reporter.log("user login",true);
	}
	
	@Test(enabled = true)
	public void addCart() {
		Reporter.log("user had product",true);
	}
	
	@Test
	public void logout() {
		Reporter.log("user logout",true);
	}
}
