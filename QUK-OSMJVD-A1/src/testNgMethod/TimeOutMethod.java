package testNgMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutMethod {

	@Test(timeOut = 2000)
	public void launch() {
		Reporter.log("TestNg");
	}
	
}
