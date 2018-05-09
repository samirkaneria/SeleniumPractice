package demoPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

public class WinDemo {
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
				
		
		
		String applicationPath = "C:\\Program Files (x86)\\Advanced\\OpenHR 9.1\\OpenHR System Manager.exe";
		String WiniumDriverPath = "C:\\Samir\\Automation Testing\\Selenium Winium\\Winium.Desktop.Driver\\Winium.Desktop.Driver.exe";
		
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath(applicationPath);
		
		File driverPath = new File(WiniumDriverPath);
		
		WiniumDriverService service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
		service.start();
	
		WiniumDriver driver = new WiniumDriver(service, options);
		
		Thread.sleep(5000);
		WebElement windowChkbx = driver.findElement(By.id("2"));
		if (windowChkbx.isSelected() )
		{
			System.out.println("Use Window Authentication check box should not checked bydefaul.");
		}
		else {
			System.out.println("Check box is not selected and working fine.");
		}
		
		
		driver.findElement(By.id("6")).sendKeys("sa");
		driver.findElement(By.id("7")).sendKeys("W3lc0m3");
		WebElement loginBtn = driver.findElement(By.id("4"));
		
		
		//new Actions(driver).keyDown(Keys.SHIFT).perform();
		loginBtn.click();
		//new Actions(driver).keyUp(Keys.SHIFT).perform();
		/*
		try
		{
			
			String myWindowHandle = driver.getWindowHandle();
			driver.switchTo().window(myWindowHandle);
			driver.findElement(By.id("6")).click();
		}
		catch (NoAlertPresentException e)
		{
			
		}
		*/
		
		
		
		//new Actions(driver).sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER)).perform();
		
		Thread.sleep(15000);
		
		WebElement titleBar = driver.findElement(By.id("TitleBar"));
		String Name = titleBar.getAttribute("Name");
		System.out.println(Name);
		
		if (Name.equals("OpenHR System Manager - std9.1  "))
		{
			System.out.println("User LoggedIn Successfully.");
		}
		else
		{
			System.out.println("User unable to login.");
		}
		
		Thread.sleep(3000);
		
		driver.close();
		
	
	}
	

}
