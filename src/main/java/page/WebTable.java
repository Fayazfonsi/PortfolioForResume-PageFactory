package page;

import java.awt.Window;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFFName;

public class WebTable extends BasePage {
	
	@FindBy(xpath = "//div[@class='left-pannel']//li[@id='item-3']")
	WebElement webtableModule;
	
	@FindBy(css = "#addNewRecordButton")
	WebElement add;
	
	@FindBy(css = "#firstName")
	WebElement firstName;
	
	@FindBy(css = "#lastName")
	WebElement lastName;
	
	@FindBy(css = "#userEmail")
	WebElement email;
	
	@FindBy(css = "#age")
	WebElement age;
	
	@FindBy(css = "#salary")
	WebElement salary;
	
	@FindBy(css = "#department")
	WebElement department;
	
	@FindBy(css = "#submit")
	WebElement submit;
	
	

	public WebTable(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void webTablePage() {
		
		webtableModule.click();
		
		
			
	
		
		
		String fname [] = {"peter","Quagmire","meg"};
		String lname [] = {"greffin","gigidy","brain"};
		String eml [] = {"pet@gmail.com","quag@gmail.com","meg@gmil.com"};
		String ag [] = {"16","18","21"};
		String slry [] = {"16000000","18000000","210000000"};
		String dpmt [] = {"ECE","CT","IT"};
		
		
		for (int i = 0; i < fname.length ; i++) {
		add.click();
		firstName.sendKeys(fname[i]);
		lastName.sendKeys(lname[i]);
		email.sendKeys(eml[i]);
		age.sendKeys(ag[i]);
		salary.sendKeys(slry[i]);
		department.sendKeys(dpmt[i]);
		submit.click();
		
		}
		
	}
	

}
