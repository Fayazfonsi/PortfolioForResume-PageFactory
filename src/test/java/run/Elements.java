package run;

import org.testng.annotations.Test;

import page.TextBox;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Elements {
	
	private WebDriver driver;
	private TextBox textBox;
  @Test
  public void textBoxM() {
	  textBox.navaigateTo("https://demoqa.com/elements");
	  textBox.impliciteWait();
	  textBox.maximize();
	  textBox.textBoxPag();
	  
	  
  }
  @BeforeSuite
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  textBox = new TextBox(driver);
	  
	  
	  
  }

  @AfterSuite
  public void tearDown() {
	  if(driver!= null) {
		  driver.quit();
	  }
  }

}
