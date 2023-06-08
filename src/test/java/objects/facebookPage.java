package objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookPage {

	WebDriver driver;

	public facebookPage(WebDriver driver) {
		this.driver = driver;
		// driver = d;
		 PageFactory.initElements(driver,this);
		}
	
	By Username_editbox = By.cssSelector("#email");;
	By Password_editbox = By.xpath("//input[@id='pass']");
	By Login_btn = By.name("login");

	public void EnterUsername() {
		driver.findElement(Username_editbox).clear();
		driver.findElement(Username_editbox).sendKeys("Testuser");
	}

	public void EnterPassword() {
		driver.findElement(Password_editbox).clear();
		driver.findElement(Password_editbox).sendKeys("Tester123");
	}

	public void VerifyLogin() {
		driver.findElement(Login_btn).click();
		String title = driver.getTitle();
		assertEquals(title, "Log in to Facebook");

	}
}