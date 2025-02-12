package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RadioButton extends BasePage {
	
	@FindBy(xpath = "(//li)[3]")
	WebElement radioButtonMobule;
	
	@FindBy(xpath = "(//div)[60]")
	WebElement yes;
	
	@FindBy(xpath = "(//div)[61]")
	WebElement impressive;

	public RadioButton(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
		
		
	}
	
	public void radiobuttonPage() {
		scrollUp();
		radioButtonMobule.click();
//		String impressivee = impressive.getText();
//		System.out.println(impressivee);
		Assert.assertEquals(yes.getText(), "Yes");
		Assert.assertEquals(impressive.getText(), "Impressive");
		yes.click();
		
		
	}

}
