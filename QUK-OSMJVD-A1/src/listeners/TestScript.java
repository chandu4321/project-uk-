package listeners;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClassIT{
	
	@Test
	public void Demo() {
		Reporter.log("testcase passed",true);
		driver.findElement(By.id("books")).click();
	}
}
