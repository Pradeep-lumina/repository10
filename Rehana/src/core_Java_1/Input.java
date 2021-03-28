package core_Java_1;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		File src = new File("C:\\Pradeep\\Batch10\\Rehana\\src\\core_Java_1\\input.properties");
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(src);
		}
		catch(Exception e)
		{
				System.out.println(e.getMessage());
		}
		
		Properties prop = new Properties();
		
		try {
			prop.load(fis);
		}
		catch(Exception e)
		{
				System.out.println(e.getMessage());
		}
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys(prop.getProperty("UN"));
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys(prop.getProperty("PWD"));
		Thread.sleep(2000);
	}

}
