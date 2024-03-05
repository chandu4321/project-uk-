package actionsClassMethod;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownAndKeyUp {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Actions actions= new Actions(driver);
		actions.sendKeys(Keys.DOWN).perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.DOWN).perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.DOWN).perform();
		actions.sendKeys(Keys.DOWN).perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.DOWN).perform();
		actions.sendKeys(Keys.DOWN).perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.UP).perform();
		
	}

}
