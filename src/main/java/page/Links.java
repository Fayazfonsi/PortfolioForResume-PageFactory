package page;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Links extends BasePage {
	
	@FindBy(xpath = "(//span[contains(text(),'Links')])[(1)]")
	WebElement linkFiedModule;
	//(//span[contains(text(),'Text Box')])
	
	@FindBy(css = "#simpleLink")
	WebElement home;

	public Links(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		}
	
	public void linksPage() {
		linkFiedModule.click();
		home.click();
		ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(1));
		System.out.println(currenturl());
		driver.close();
		driver.switchTo().window(a.get(0));
		System.out.println(currenturl());
		
		
		
	}

}
