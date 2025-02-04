package page;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	protected WebDriver driver;
	protected JavascriptExecutor js,js1;
	
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
	
	public void scrolldown() {
		js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(24,340)");		
	}
	
	public void scrollUp() {
		js1 = (JavascriptExecutor) driver;
		js1.executeScript("javascript:window.scrollBy(340,240)");
	}
	
	

}
