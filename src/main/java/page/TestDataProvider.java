package page;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	@DataProvider(name = "TextBox")
	public static Object[][]getTextBoxDetails(){
		return new Object[][] {
			{"kundan", "potatao@gmail.com", "poo pandhal teru", "kotameadu"}
		};
		
		
	}
		
	}
	


