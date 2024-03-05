package selectClassMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSingleSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		WebElement opt = driver.findElement(By.id("products-orderby"));
		Select sel=new Select(opt);
//		System.out.println(sel.isMultiple());//to check the dropdown is single r multi select
//		sel.selectByVisibleText("Name: A to Z");//selected the option using visible text
		
		List<WebElement> options = sel.getOptions(); //to get the options present inside the dropdown
		for(WebElement var:options) {
			System.out.println(var.getText());
		}
	}

}
