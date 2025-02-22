package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {
	private static WebDriver driver;
	private static ConfigReader config = new ConfigReader();
	
	public static WebDriver getDriver() {
		if (driver == null) {
			String browser = config.getProperty("browser");
			
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", config.getProperty("chromeDriverPath"));
				
				driver = new ChromeDriver();
				
			}
			else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", config.getProperty("firefoxDriverPath"));
            driver = new FirefoxDriver();
			
		}
			else {
				throw new RuntimeException("Unsupported browser: " + browser);
			}
		}
		return driver;
	}
	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
			
		}
	}

}
