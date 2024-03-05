package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningIsSelected {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		//System.out.println(driver.findElement(By.id("gender-male")).isSelected());  //false
		
		driver.findElement(By.id("gender-male")).click();
		System.out.println(driver.findElement(By.id("gender-male")).isSelected());	  //true
		

	}

}
