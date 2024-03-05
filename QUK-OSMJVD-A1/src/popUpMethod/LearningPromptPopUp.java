package popUpMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningPromptPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
//		driver.switchTo().alert().accept();//to perform click action on ok button
//		driver.switchTo().alert().dismiss();//to perform click action on cancel button
		driver.switchTo().alert().sendKeys("Selenium");//to enter values inside textbox
		//driver.switchTo().alert().accept();
	}

}
