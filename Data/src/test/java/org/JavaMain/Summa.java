package org.JavaMain;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Summa extends BaseClassh {
	static WebDriver driver;
	static WebElement email;
	static WebElement pass;
	
	
	@Test(dataProvider= "provider", dataProviderClass=Summa.class,enabled=false)
	@Parameters({ "username" ,"password"})
	private void syr11(String use ,String pas) {
		
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");
		PageFactory.initElements(driver, Summa.class);
		email.sendKeys(use);
		pass.sendKeys(pas);
		driver.quit();
		
	}
	
	@Test(groups="sanity")

	private void syr112() {
System.out.println("teacher");
	}
	
	@Test(retryAnalyzer=Rerun.class)
	private void syr23() {
		Assert.assertEquals(true, false);
System.out.println("contractor");



}
	
	
	
	@DataProvider(name="provider")
	
	public   Object[][] data1() {
	
		return new Object[][]{
		{"greens","password"},
		{"project","selenum"}
		
		
			
				
	};
	
	
	
}
	

}