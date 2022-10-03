package trial;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tempt1 
{
	
	public static void main (String[]args) throws InterruptedException
	{

		
		// Browser Launch
		System.setProperty("webdriver.chrome.driver", "C:\\Local Disk D\\Automation Support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//open Application
		driver.get("https://www.flipkart.com/");
		// click on cancle button
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		//click on login button
		driver.findElement(By.xpath("//*[@class='_1_3w1N']")).click();
		// enter username
		driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("9545172923");
		// enter password
		driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("9545172923");
		//click on login button
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		//click on mobile
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='xtXmba'])[3]")).click();
		//click on narzo
		driver.findElement(By.xpath("(//*[@class='_1aqDWQ'])[4]")).click();
		// click on realme Narzo 30 Pro 5G (Blade Silver, 128 GB)
		driver.findElement(By.xpath("(//*[@class='_4rR01T'])[1]")).click();
		// To change focuas on next page
		Thread.sleep(3000);
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> itr=ids.iterator();
		String one=itr.next();
		String two=itr.next();
		driver.switchTo().window(two);
		//Add to card
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		// back to main page
		Thread.sleep(3000);
		driver.switchTo().window(one);
		// click on cart
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='KK-o3G']")).click();
		
		
		
	}
	
}
