package selectClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningMultiSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/dropDown.html");
		WebElement m1 = driver.findElement(By.id("m1"));
		Select sel= new Select(m1);
		System.out.println(sel.isMultiple());
		sel.selectByVisibleText("Mango");// selected by visible text
		sel.selectByIndex(2); // selected by Index
		Thread.sleep(2000);
		sel.deselectByIndex(2);// deselected by Index
		WebElement opt = sel.getFirstSelectedOption();	//fetching first selected option	
		System.out.println(opt.getText());
	}

}
