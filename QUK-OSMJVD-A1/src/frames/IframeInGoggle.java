package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeInGoggle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		WebElement iframe = driver.findElement(By.name("app"));
		
		driver.switchTo().frame(iframe);//frame by webelement
		//driver.switchTo().frame("app");//frame by name/id
		
		driver.findElement(By.xpath("//span[text()='Maps']")).click();

	}

}
