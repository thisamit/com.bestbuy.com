package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class SearchByCategory_Page extends BaseLibrary {
	
	@FindBy(xpath="//*[@class=\"darkGrey_oThXm  icon_q2ZYd\"]")
	WebElement shop;
	@FindBy(xpath="//a[@title=\"Computers, Tablets, & Accessories\"]")
	WebElement Electronics;
	@FindBy(xpath="//a[@title=\"Laptops & MacBooks\"]")
	WebElement macatorg;
	@FindBy(xpath="//a[@title=\"MacBooks\"]")
	WebElement macbook;
	public SearchByCategory_Page() {
		   
		PageFactory.initElements(driver,this);
	}
	
	public void clickoncategories() throws InterruptedException {
		//driver.findElement(email).sendKeys("amitkumar0126@gmail.com");
		shop.click();
		Thread.sleep(2000);
		Electronics.click();
		Thread.sleep(2000);
		macatorg.click();
		Thread.sleep(1000);
		macbook.click();
		Thread.sleep(10000);
		
		
	}
}
