package page;

import java.awt.Desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckBox extends BasePage {
	
	@FindBy(xpath = "(//li)[2]")
	WebElement checkBoxModule;
	
	@FindBy(xpath = "(//button)[4]")
	WebElement homeArrow;
	
	@FindBy(xpath = "(//button)[5]")
	WebElement deshktop;
	
	@FindBy(xpath = "(//button)[6]")
	WebElement documents;
	
	@FindBy(xpath = "(//button)[9]")
	WebElement download;
	
	@FindBy(xpath = "(//span)[92]")
	WebElement excelFile;
	
	@FindBy(xpath = "(//span)[86]")
	WebElement wordFile;
	
	@FindBy(xpath = "(//span)[76]")
	WebElement office;
	
	@FindBy(xpath = "(//span)[72]")
	WebElement workspace;
	
	@FindBy(xpath = "(//span)[64]")
	WebElement command;
	
	@FindBy(xpath = "(//span)[58]")
	WebElement notes;
	
	@FindBy(xpath = "(//span)[96]")
	WebElement outputHome;
	
	
	
	
	
	
	
	
	

	public CheckBox(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void checkBoxPage() {
		
		scrollUp();
		checkBoxModule.click();
		scrolldown();
		homeArrow.click();
		deshktop.click();
		documents.click();
		download.click();
		excelFile.click();
		wordFile.click();
		office.click();
		workspace.click();
		command.click();
		notes.click();
		scrollUp();
		String opts = outputHome.getText();
		System.out.println(opts);
		
		Assert.assertEquals(opts, "home");
		
				
				
				
				
				
				
			    
		
		
		
		
		
		
		
	}
	
	
	
	

}
