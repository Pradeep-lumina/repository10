package core_Java_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {
	
	public static void main(String args[])
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	Actions action = new Actions(driver);
	
	WebElement right = driver.findElement(By.xpath("//span[text()='right click me']"));
	
	//action.contextClick(right).build().perform();
	
	action.contextClick(right)
	.sendKeys(Keys.ARROW_DOWN)
	.sendKeys(Keys.ARROW_DOWN)
	.sendKeys(Keys.ARROW_DOWN)
	.sendKeys(Keys.ENTER)
	.build()
	.perform();
	}
}
