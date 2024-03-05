package testNgMethod;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnatationMethod {

	@Test
	public void actions() {
		Reporter.log("used has performed actions",true);
	}
	
	@BeforeSuite
	public void dataBaseConn() {
		Reporter.log("connected with dataBase",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the browser",true);
	}
	
	@BeforeTest
	public void perCon() {
		Reporter.log("Per condition to launch",true);
	}
	
	@BeforeClass
	public void launch() {
		Reporter.log("launch the appln",true);
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("login actions",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("user has logout",true);
	}
	
	@AfterSuite
	public void closeConn() {
		Reporter.log("close conn b/w DataBase",true);
	}
	
	@AfterTest
	public void postConn() {
		Reporter.log("post conditions",true);
	}
}
