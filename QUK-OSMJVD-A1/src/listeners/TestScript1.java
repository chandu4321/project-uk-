package listeners;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript1 extends BaseClassIT {

	@Test
	public void demo1() {
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("text")).sendKeys("chandana");
	}
}
