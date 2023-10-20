package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;
import excelutility.getreaddata;
import waitutility.WaitUtility;

public class SearchProduct extends BaseLibrary{

	
	@FindBy(xpath="//input[@type=\"search\"]")
	WebElement search;


//By enter=By.xpath("//input[@name=\"password\"]");



	public SearchProduct() {
	   
		PageFactory.initElements(driver,this);
	}
	
	public void searchfurnityure(String furniture) throws InterruptedException {
		//driver.findElement(email).sendKeys("amitkumar0126@gmail.com");
		search.sendKeys(furniture);
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(6000);
	}
	
	

}
