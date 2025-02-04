package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TextBox extends BasePage {

	@FindBy(xpath = "(//li)[1]")
	WebElement tesxBoxModule;

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

	public void textBoxPag() {
		tesxBoxModule.click();
		scrolldown();
		fullName.sendKeys("kundan");
		email.sendKeys("potatao@gmail.com");
		currentAddress.sendKeys("poo pandhal teru");
		permenentAddress.sendKeys("kotameadu");
		scrolldown();
		submit.click();
		String nm = oname.getText();
		String oe = oemail.getText();
		String ocaa = oca.getText();
		String opaa = opa.getText();

		Assert.assertEquals(nm, "Name:kundan");
		Assert.assertEquals(oe, "Email:potatao@gmail.com");
		Assert.assertEquals(ocaa, "Current Address :poo pandhal teru");
		Assert.assertEquals(opaa, "Permananet Address :kotameadu");

		// System.out.println(opaa);

	}
	
	

}
