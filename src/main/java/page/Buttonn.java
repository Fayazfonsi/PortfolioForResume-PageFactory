package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Buttonn extends BasePage {
	
	
	
	@FindBy(xpath = "//div[@class='left-pannel']//li[@id='item-4']")
	WebElement buttonPage;
	
	@FindBy(css = "#doubleClickBtn")
	WebElement doubleClick;
	
	@FindBy(css = "#doubleClickMessage")
	WebElement dCM;

	public Buttonn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void buttonPage() {
		
		buttonPage.click();
		scrolldown();
		explicitWait(By.cssSelector("#doubleClickBtn"));
		Actions a = new Actions(driver);
		a.moveToElement(doubleClick).doubleClick().build().perform();
		
		
		
		
		
		
	}

	

}
