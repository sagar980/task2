package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class populatedata {
		
		WebDriver driver;
		
		By Forename=By.id("forename");
		By email=By.xpath("//*[@id=\'email\']");
		By Message=By.id("message");
		By submit=By.xpath("//a[text()='Submit']");
		
		//create constructor
		
		public populatedata(WebDriver driver)//specify one argument and specify the driver
		{
			this.driver=driver; //it's intialize the class webdriver driver
			
		}
		
		//create Method forename
		
		public void typeforename()
		{
			driver.findElement(Forename).sendKeys("John");
		}
		//create Method for email
		
		public void typeemail()
		{
			driver.findElement(email).sendKeys("john.example@planit.net.au");
			
		}
		
		//create Method for Message
		
		public void Message()
		{
			driver.findElement(Message).sendKeys("Tell us about it");				
		}
		
		
		//create Method for Submit Button
		
		public void Submit()
		{
				driver.findElement(submit).click();					
		}
				
}
