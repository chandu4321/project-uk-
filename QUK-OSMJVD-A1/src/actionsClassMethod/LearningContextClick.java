package actionsClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningContextClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		Actions actions= new Actions(driver);
		WebElement option = driver.findElement(By.xpath("//span[text()='Women Ethnic']"));
		actions.contextClick(option).perform();
		
	}

}
