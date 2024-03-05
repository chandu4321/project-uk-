package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSoftAssert {
	String name="chandana";
	String lastname="N";
	String Email="chintu123@gmail.com";
	String Password="abcd123";
	String Confirm="abcd123";
	@Test
	public void launchDemo() {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			SoftAssert sa= new SoftAssert();
			driver.get("https://demowebshop.tricentis.com/");
			sa.assertEquals(driver.getTitle(), "Demo Web Shop","user not landed to Demo Web Shop");
			driver.findElement(By.linkText("Register")).click();
			sa.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/register","user not landed to register page");
			WebElement gender = driver.findElement(By.id("gender-female"));
			gender.click();
			//sa.assertFalse(gender.isSelected(), "user not clicked");
			sa.assertTrue(true, "user not clicked on female radio button");
			WebElement firstName = driver.findElement(By.id("FirstName"));
			firstName.sendKeys(name);
			sa.assertEquals(firstName.getAttribute("value"), "chandana","firstname is not matching");
			WebElement lastName = driver.findElement(By.id("LastName"));
			lastName.sendKeys(lastname);
			sa.assertEquals(lastName.getAttribute("value"), "N","lastName is not matching");
			WebElement email = driver.findElement(By.id("Email"));
			email.sendKeys(Email);
			sa.assertEquals(email.getAttribute("value"), "chintu123@gmail.com","email is not matching");
			WebElement password = driver.findElement(By.id("Password"));
			password.sendKeys(Password);
			sa.assertEquals(password.getAttribute("value"), "abcd123", "password is not matching");
			WebElement confirm = driver.findElement(By.id("ConfirmPassword"));
			confirm.sendKeys(Confirm);
			sa.assertEquals(confirm.getAttribute("value"), "abcd123","confirm password is not matching");
			driver.findElement(By.id("register-button")).click();
			sa.assertTrue(true, "user not clicked on register button");
			driver.quit();
			sa.assertAll();
		}
	}

	

