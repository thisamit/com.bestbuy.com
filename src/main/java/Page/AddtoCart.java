package Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class AddtoCart extends BaseLibrary{
	
	@FindBy(xpath="//*[text()=\"Costway Kids Astronaut Sofa Children Armrest Couch Toddler Furniture\"]")
	WebElement addfurnitureclick;
	
	public AddtoCart() {
		PageFactory.initElements(driver, this);
	}
	public void addcart() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		addfurnitureclick.click();
		Thread.sleep(2000);
	}
	

}
