package batchExceution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchMaybellin {
	@Test(groups = "beauty")
	public void maybellin() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.maybelline.co.in/?utm_source=google&utm_medium=cpc&utm_campaign=&utm_content=&utm_term=maybelline&gad_source=1&gclid=Cj0KCQiAzoeuBhDqARIsAMdH14HZoIjv98T1_SooZjXQ4Oivta5UqKIW9vRR9e_or1d7GRBgWBbJ0jsaApPmEALw_wcB");
		driver.quit();
	}
}
