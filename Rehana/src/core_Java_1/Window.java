package core_Java_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://gmail.co.in/");
		
		String maintab = driver.getWindowHandle();
		System.out.println(maintab);
		
		WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));
		help.click();
		Thread.sleep(2000);
		
		Set<String> tabs = driver.getWindowHandles();
		System.out.println(tabs);
		
		for(String tab:tabs)
		{
			driver.switchTo().window(tab);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.equals("Google Account Help"))
			{
				WebElement element = driver.findElement(By.xpath("//a[text()='Create a Google Account']"));
				element.click();
				Thread.sleep(2000);
			}
			
		}
		/*
		WebElement element = driver.findElement(By.xpath("//a[text()='Create a Google Account']"));
		element.click();
		Thread.sleep(2000);
	    */
	}

}
