package testNgMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodMethod {
	
	@Test(dependsOnMethods = "register")
	public void login() {
		Reporter.log("user has login",true);
	}
	
	@Test
	public void register() {
		Reporter.log("user has registered",true);
	}
	
	@Test
	public void logout() {
		Reporter.log("user has logout",true);
	}
	
	@Test
	public void addCart() {
		Reporter.log("product added to cart",true);
	}
}
