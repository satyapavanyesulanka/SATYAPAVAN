package objects;


import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleSearch_page {

	WebDriver driver;

	public googleSearch_page(WebDriver driver) {
		this.driver = driver;
		
		//driver = d;
		PageFactory.initElements(driver,this);
	}

	// By clickONButton
	// =By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button");
	By searchbox = By.xpath("//textarea[@id='APjFqb']");
	By Search_btn = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]");
	By Facebook_link = By.xpath("//h3[normalize-space()='Facebook - log in or sign up']");

	public void searchgoogle(String Searchinput) {
		// TODO Auto-generated method stub
		try {
			// driver.findElement(clickONButton).click();
			driver.findElement(searchbox).sendKeys(Searchinput);
			Thread.sleep(1000);
			driver.findElement(Search_btn).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Exceptions Caught" + e.getMessage());
		}
	}

	public void ClickFacebook() {
		// TODO Auto-generated method stub
		try {
			driver.findElement(Facebook_link).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Exceptions Caught" + e.getMessage());
		}
	}
}