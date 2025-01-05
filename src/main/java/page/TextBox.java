package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBox extends BasePage {
	
	@FindBy(xpath = "(//li)[1]")
	WebElement tesxBoxModule;

	public TextBox(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	public void textBoxPag() {
		tesxBoxModule.click();
		
		
	}

}
