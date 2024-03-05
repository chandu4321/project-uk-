package testNgMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityMethod {
	
	@Test(priority = 2)
	public void logout() {
		Reporter.log("user has logout the appln",true);
	}
	
	@Test(priority = -1)
	public void register() {
		Reporter.log("user has registered",true);
	}
	
	@Test(priority = 0)
	public void login() {
		Reporter.log("user has login the appln",true);
	}
	
	@Test(priority = 1)
	public void addToCart() {
		Reporter.log("user has add the product to cart",true);
	}
	
}
