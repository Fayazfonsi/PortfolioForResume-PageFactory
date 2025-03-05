package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class Buttonn extends BasePage {
	
	
	
	@FindBy(xpath = "(//span[contains(text(),'Buttons')])")
	 // new xpath type(//span[contains(text(),'Text Box')])
	WebElement buttonPage;
	
	@FindBy(css = "#doubleClickBtn")
	WebElement doubleClick;
	
	@FindBy(css = "#doubleClickMessage")
	WebElement dc;
	
	@FindBy(css = "#rightClickBtn")
	WebElement rightClick;
	
	@FindBy(css = "#rightClickMessage")
	WebElement rc;
	
	@FindBy(xpath = "(//button)[4]")
	WebElement clickMe;
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
		scrolldown();
		String dco = dc.getText();
		//System.out.println(dco);
		Assert.assertEquals(dco,"You have done a double click");
		a.moveToElement(rightClick).contextClick().build().perform();
		String rco = rc.getText();
		//System.out.println(rco);
		Assert.assertEquals(rco, "You have done a right click");
		clickMe.click();
	}

	

}
