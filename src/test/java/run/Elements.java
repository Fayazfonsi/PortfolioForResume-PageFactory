package run;

import org.testng.annotations.Test;

import page.CheckBox;
import page.RadioButton;
import page.TextBox;
import page.WebTable;

import org.testng.annotations.BeforeSuite;

import java.awt.Checkbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Elements {
	
	private WebDriver driver;
	private TextBox textBox;
	private CheckBox checkBox;
	private RadioButton radioButton;
	private WebTable webTable;
  
	

	@Test(priority=0)
	public void textBoxM() {
	  textBox.navaigateTo("https://demoqa.com/elements");
	  textBox.impliciteWait();
	  textBox.maximize();
	  textBox.textBoxPag();
	  
	  
  }
	
	@Test(priority=1)
	
	public void checkBoxM() {
		checkBox.checkBoxPage();
		
		
	}
	
	@Test(priority=2)
	public void radioButtonM() {
		radioButton.radiobuttonPage();
		
	}
	
	@Test(priority=3)
	public void webTableM() {
		webTable.webTablePage();
		
	}
	
  @BeforeSuite
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  textBox = new TextBox(driver);
	  checkBox = new CheckBox(driver);
	  radioButton = new RadioButton(driver);
	  webTable = new WebTable(driver);
	  
	  
  }

  @AfterSuite
  public void tearDown() {
	  if(driver!= null) {
		  driver.quit();
	  }
  
  }

}
