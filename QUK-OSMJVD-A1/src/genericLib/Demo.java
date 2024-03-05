package genericLib;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Demo extends BaseClass{
	@Test
	public void script() {
		driver.findElement(By.partialLinkText("Books")).click();
	}
	
}
