package popUpMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/page7.html");
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
	//	driver.switchTo().alert().accept();//for clicking on ok button
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();//for click on cancle button

	}

}
