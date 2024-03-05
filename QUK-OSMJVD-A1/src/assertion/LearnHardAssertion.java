package assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnHardAssertion {
	@Test
	public void launchDemo() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		assertEquals(driver.getTitle(), "Demo Web Shop","user not landed to Demo Web Shop");
		driver.findElement(By.linkText("Register")).click();
		assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/register","user not landed to register page");
		WebElement gender = driver.findElement(By.id("gender-female"));
		gender.click();
		assertFalse(gender.isSelected(), "user not clicked");
		//assertTrue(true, "user not clicked on female radio button");
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("chandana");
		assertEquals(firstName.getAttribute("value"), "chandana","firstname is not matching");
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("N");
		assertEquals(lastName.getAttribute("value"), "N","lastName is not matching");
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("abc124@gmail.com");
		assertEquals(email.getAttribute("value"), "abc124@gmail.com","email is not matching");
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("abcd123");
		assertEquals(password.getAttribute("value"), "abcd123", "password is not matching");
		WebElement confirm = driver.findElement(By.id("ConfirmPassword"));
		confirm.sendKeys("abcd123");
		assertEquals(confirm.getAttribute("value"), "abcd123","confirm password is not matching");
		driver.findElement(By.id("register-button")).click();
		assertTrue(true, "user not clicked on register button");
	}
}
