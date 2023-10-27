package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryPage {
//Declaration
	@FindBy(xpath="addresstype")
	private WebElement selectDd;
	
	//address of feedback
	@FindBy(xpath="FEEDBACK")
	private WebElement feedbackbtn;
	
	//initialization
			public DemoSkillraryPage(WebDriver driver) {
			PageFactory.initElements(driver, driver);
			}
	
	//utilization
	public WebElement getSelectDd() {
		return selectDd;
	}

	public WebElement getFeedbackbtn() {
		return feedbackbtn;
	}

	
		
	}

