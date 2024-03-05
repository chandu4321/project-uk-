package genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pom_Repo {

	public Pom_Repo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
}
