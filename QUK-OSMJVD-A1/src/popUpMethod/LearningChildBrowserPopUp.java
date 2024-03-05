package popUpMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(parentWindowId);
		System.out.println(allWindowId);
		//allWindowId.remove(parentWindowId);
		System.out.println(driver.getTitle());
		for(String i:allWindowId) {
			driver.switchTo().window(i);
			System.out.println(driver.getTitle());
			Thread.sleep(4000);
			//driver.close();
		}
		driver.switchTo().window(parentWindowId);
		driver.close();
	}
}
