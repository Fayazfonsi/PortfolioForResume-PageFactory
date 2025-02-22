package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.management.RuntimeErrorException;

public class ConfigReader {
	private Properties properties;
	
	public ConfigReader() {
		try {
			FileInputStream fis = new FileInputStream("src/main/java/resources/config.properties");
			properties = new Properties();
			properties.load(fis);
			fis.close();
		}catch (IOException  e) {
			throw new RuntimeException("fail to load configuration file!", e);
			// TODO: handle exception
		}
	}
	public String getProperty(String Key) {
		return properties.getProperty(Key);
		
	}

}
