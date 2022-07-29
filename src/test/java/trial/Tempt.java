package trial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt 
{
	public static void main(String[]ags) throws InterruptedException
	{
		//smoke Test
		// Browser Launch
		System.setProperty("webdriver.chrome.driver", "C:\\Local Disk D\\Automation Support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		//open Application
		driver.get("https://www.flipkart.com/");
		//click on cancle button
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		//navigate on login
		Actions act=new Actions(driver);											                        
		WebElement xyz=driver.findElement(By.xpath("//*[@class='_1_3w1N']"));                
		act.moveToElement(xyz).build().perform();
		// click on profile 
		driver.findElement(By.xpath("//*[text()='My Profile']")).click();
		// Enter uername
		driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("9545172923");
		// Enter password
		driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("9545172923");
		//click on login
		driver.findElement(By.xpath("//*[text()='My Profile']")).click();
		Thread.sleep(5000);
		//click on manage Address
	    driver.findElement(By.xpath("(//*[@class='NS64GK'])[1]")).click();
	    // Add Address
	    driver.findElement(By.xpath("//*[@class='_1QhEVk']")).click();
	    // Enter Name
	    driver.findElement(By.xpath("(//*[@class='_1w3ZZo _2mFmU7'])[1]")).sendKeys("Ganesh Taware");
	    // enter Mobile no
	    driver.findElement(By.xpath("(//*[@class='_1w3ZZo _2mFmU7'])[2]")).sendKeys("9545172923");
	    // Enter Pincode
	    driver.findElement(By.xpath("(//*[@class='_1w3ZZo _2mFmU7'])[3]")).sendKeys("412207");
		// Enter Locality
	    driver.findElement(By.xpath("(//*[@class='_1w3ZZo _2mFmU7'])[4]")).sendKeys("Wagholi");
	    // Enter Address
	   driver.findElement(By.xpath("//*[@class='_1sQQBU _1w3ZZo _1TO48q']")).sendKeys("Pravin Boys Hostel, Baif Road");
	    // Address Type
	    driver.findElement(By.xpath("(//*[@class='_1XFPmK'])[1]")).click();
		// Click on Save
	    driver.findElement(By.xpath("//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']")).click();
	}
}
