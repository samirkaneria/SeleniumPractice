package demoPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Samir\\Automation Testing\\Selenium Browser Drivers\\FireFox Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// Launch google website.
		driver.get("https://www.google.com");
		
		//Check Page title.
		String siteTitle = ""; 
		siteTitle = driver.getTitle();
		
		System.out.println(siteTitle);
		System.out.println("Testing of commit update on github");
		
		
		//Search for samir kaneria in google search bar.
		driver.findElement(By.id("lst-ib")).sendKeys("Samir Kaneria");
		driver.findElement(By.name("btnK")).click();
		
		siteTitle = driver.getTitle();
		
		if (siteTitle.equals("Samir Kaneria - Google Search"))
		{
			System.out.println("User successfully redirect on search result page.");
		}
		else
		{
			System.out.println("user not redirect on search result page.");
		}
		
		
		
		
		//check 
		Thread.sleep(5000);
		
		driver.quit();
	
	}

}
