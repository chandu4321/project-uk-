package webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetTitleMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//to get the title of the appln
		//System.out.println(driver.getTitle());
		
		//to get the current url of the appln
		System.out.println(driver.getCurrentUrl());
		
		//to get page souce of the appln
		System.out.println(driver.getPageSource());
		
		driver.quit();

	}

}
