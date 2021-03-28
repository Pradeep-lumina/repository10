package core_Java_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement element = driver.findElement(By.xpath("(//a[@class='a-link-normal  a-inline-block'])[5]"));
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		
		WebElement element1 = driver.findElement(By.xpath("(//a[@class='a-link-normal  a-inline-block'])[12]"));
		
		je.executeScript("arguments[0].scrollIntoView(true);", element1);

	}

}
