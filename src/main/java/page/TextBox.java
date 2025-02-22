package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TextBox extends BasePage {

	@FindBy(xpath = "(//li)[1]") //div[@class='left-pannel']////li[@class='btn btn-light ']
	WebElement tesxBoxModule;      // new xpath type(//span[contains(text(),'Text Box')])

	@FindBy(css = "#userName")
	WebElement fullName;

	@FindBy(css = "#userEmail")
	WebElement email;

	@FindBy(css = "#currentAddress")
	WebElement currentAddress;

	@FindBy(css = "#permanentAddress")
	WebElement permenentAddress;

	@FindBy(css = "#submit")
	WebElement submit;

	@FindBy(css = "#name")
	WebElement oname;

	@FindBy(css = "#email")
	WebElement oemail;

	@FindBy(css = "p[id='currentAddress']")
	WebElement oca;

	@FindBy(css = "p[id='permanentAddress']")
	WebElement opa;
	
	@FindBy(xpath = "(//li)[2]")
	WebElement checkBoxModule;

	
	public TextBox(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@DataProvider(name = "details")
	public Object[][] getTextBoxDetails(){
		return new Object[][] {
			{"kundan","potatao@gmail.com","poo pandhal teru","kotameadu"}
			
		};
		
		
	}
	
	
	
	@Test(dataProvider = "details")
	public void textBoxPag(String fname, String femail, String cAdd, String pAdd) {
		explicitWait(By.xpath("(//span)[4]"));
		tesxBoxModule.click();
		//scrolldown();
		fullName.sendKeys(fname);
		email.sendKeys(femail);
		currentAddress.sendKeys(cAdd);
		permenentAddress.sendKeys(pAdd);
		//scrolldown();
		submit.click();
		
		
	}
	
	

//	public void textBoxPag1() {
//		tesxBoxModule.click();
//		scrolldown();
//		fullName.sendKeys("kundan");
//		email.sendKeys("potatao@gmail.com");
//		currentAddress.sendKeys("poo pandhal teru");
//		permenentAddress.sendKeys("kotameadu");
//		scrolldown();
//		submit.click();
//		String nm = oname.getText();
//		String oe = oemail.getText();
//		String ocaa = oca.getText();
//		String opaa = opa.getText();
//
//		Assert.assertEquals(nm, "Name:kundan");
//		Assert.assertEquals(oe, "Email:potatao@gmail.com");
//		Assert.assertEquals(ocaa, "Current Address :poo pandhal teru");
//		Assert.assertEquals(opaa, "Permananet Address :kotameadu");
//
//		// System.out.println(opaa);
//
//	}
	
	

}
