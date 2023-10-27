package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
//Declaration
	//address of fecebook
	@FindBy(xpath ="(//i[@class='fa fa-facebook'])[2]")
	private WebElement Facebook;
	
	//initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, driver);
		}
	//utilization
		public WebElement getFacebook() {
			return Facebook;
		}
		//Business librabries
		public void FacebookWebElement() {
			Facebook.click();
		}
	
}
