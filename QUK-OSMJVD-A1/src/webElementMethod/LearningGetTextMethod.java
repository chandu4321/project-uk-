package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetTextMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("chandana");
		driver.findElement(By.id("LastName")).sendKeys("N");
		driver.findElement(By.id("register-button")).click();
		//this is to fetch your error message in the webpage using Gettext
		System.out.println(driver.findElement(By.xpath("//span[text()='Email is required.']")).getText());
		//this is to fetch the normal text present in webpage using GetText
	//	System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]")).getText());
		
		
		System.out.println(driver.findElement(By.xpath("//span[text()='First name is required.']")).getText());
	}

}
