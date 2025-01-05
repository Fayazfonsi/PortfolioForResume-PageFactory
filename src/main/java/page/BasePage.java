package page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void navaigateTo(String url) {
		driver.get(url);
	}
	
	public String currenturl() {
		return driver.getCurrentUrl();
		
	}
	
	public void maximize() {
		driver.manage().window().maximize();
	}
	
	public void impliciteWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	

}
