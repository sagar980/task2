/**
 * 
 */
package com.jupiter;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Testcase.populatedata;

/**
 * @author sagard
 *
 */
public class populateData {
	
	@Test //its annotation
	
	public void verifydata() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\eclipse\\Chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jupiter.cloud.planittesting.com/#/");
		
		Thread.sleep(3000);
		//click on contact
		
		driver.findElement(By.xpath("//*[@id=\'nav-contact\']/a")).click();
		
		Thread.sleep(4000);
		
		populatedata populate= new populatedata(driver);
		
		populate.typeforename();// populate is object
		populate.typeemail();
		populate.Message();
		populate.Submit();
		
		Thread.sleep(15000);
		
		System.out.println("Validation successful");
		driver.quit();
	}
}
