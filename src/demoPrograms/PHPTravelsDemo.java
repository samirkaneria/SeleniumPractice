package demoPrograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PHPTravelsDemo 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Samir\\Automation Testing\\Selenium Browser Drivers\\FireFox Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new InternetExplorerDriver();
		
		
		// Launch google website.
		driver.get("http://qasrvr08.company.local/OpenHRPE9.1/");
		
		Thread.sleep(3000);
		
		
		
		WebElement  userName = driver.findElement(By.id("txtUserName"));
		System.out.println("User Name control find successfully.");
		userName.clear();
		userName.sendKeys("admin");
		
		WebElement passWord = driver.findElement(By.id("txtPassword"));
		passWord.clear();
		passWord.sendKeys("admin");
		
		driver.findElement(By.id("submitLoginDetails")).click();
		
		Thread.sleep(5000);
		
		WebElement homeButton = driver.findElement(By.id("toolbarHome"));
		
		if (homeButton.isDisplayed())
		{
			System.out.println("User Logged In Successfully");
		}
		else
		{
			System.out.println("User unable to login, may be something wrong.");
		}
		
		
		Thread.sleep(2000);
		driver.close();
		
	}
	
}