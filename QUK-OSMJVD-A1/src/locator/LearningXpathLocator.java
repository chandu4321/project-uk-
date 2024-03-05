package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpathLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));

		//contains for attribute
		driver.findElement(By.xpath("//img[contains(@src,'/Themes/DefaultClean')]"));
		
		
		//contains for text
		driver.findElement(By.xpath("//div[contains(text(),'Copyright © 2024')]"));
		
		}

}
