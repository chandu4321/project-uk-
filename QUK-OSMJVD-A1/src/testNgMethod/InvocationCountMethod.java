package testNgMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountMethod {
	@Test(invocationCount = 0)
	public void logout() {
		Reporter.log("user has logout",true);
	}
	
	@Test()
	public void login() {
		Reporter.log("user has login",true);
	}
	
	@Test(invocationCount = 2)
	public void addCart() {
		Reporter.log("user has added product",true);
	}
	
	@Test(invocationCount = 1)
	public void register() {
		Reporter.log("user has registered",true);
	}
	
}
