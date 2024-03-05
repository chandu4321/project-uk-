package genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_Pom extends Pom_Repo{
	public HomePage_Pom(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(linkText = "Register")
	private WebElement registerButton;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchBox;
	
	@FindBy(partialLinkText = "Books")
	private WebElement booksButton;
	
	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getBooksButton() {
		return booksButton;
	}

	public WebElement getComputersButton() {
		return computersButton;
	}

	public WebElement getEleButton() {
		return eleButton;
	}

	public WebElement getApparelButton() {
		return apparelButton;
	}

	public WebElement getDigitalButton() {
		return digitalButton;
	}

	public WebElement getJewelryButton() {
		return jewelryButton;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getText() {
		return text;
	}


	@FindBy(partialLinkText = "Computers")
	private WebElement computersButton;
	
	@FindBy(partialLinkText = "Electronics")
	private WebElement eleButton;
	
	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement apparelButton;
	
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitalButton;
	
	@FindBy(partialLinkText = "Jewelry")
	private WebElement jewelryButton;
	
	@FindBy(linkText = "Log in")
	private WebElement loginButton;
	
	@FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
	private WebElement text;
	
	
}
