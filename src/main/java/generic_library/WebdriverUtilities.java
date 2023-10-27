package generic_library;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtilities {
	//1 handling right click 
	public void rightclick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	//2 handling double click 
	public void doubleclick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	//3 handling dropdown
	public  void dropDown(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	//4 handling mouseover
	public void mouseOvering(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	//5 handling drag and drop
	public  void dragAndDroping( WebDriver driver,WebElement ele1, WebElement ele2 ) {
		Actions a = new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
	}
	//6 handling frame
	public void Frames(WebDriver driver, String Value) {
		driver.switchTo().frame(Value);
	}
	//7 handling default content
	public void Frames(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	//8 handling childbrowser
	public void childBrowser(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for (String b: child) {
			driver.switchTo().window(b);
		}
	}
	// 9 Handling Scrolling
	public void Scrolling(WebDriver driver, WebElement ele) { 
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView();", ele);
		} 
	// 10 Handling pop up
	public void popup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
}



