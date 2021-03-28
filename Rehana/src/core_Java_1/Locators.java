package core_Java_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		*/
		
		/*
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\FITA\\Downloads\\geckodriver-v0.29.0-win64 (2)\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://gmail.com/");
		
		driver.navigate().to("https://gmail.com/");
		
		//driver.findElement(By.id("identifierId")).sendKeys("Testing");
		
		//driver.findElement(By.name("identifier")).sendKeys("Testing name");
		
		//driver.findElement(By.linkText("Learn more")).click();
		
		//driver.findElement(By.partialLinkText("Learn")).click();
		
		//driver.findElement(By.cssSelector("input[id='identifierId']")).sendKeys("Testing");
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("Testing Absolute xpath");
		
		//driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("Relative xpath");
		
		WebElement email_id = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[1]"));
		email_id.sendKeys("Testing Relative Xpath");
		Thread.sleep(2000);
		
		//WebElement Help = driver.findElement(By.xpath("//a[text()='Help']"));
		//Help.click();
		
		email_id.clear();
		Thread.sleep(2000);
		
		email_id.sendKeys("Automation");
		
		String title = driver.getTitle();
		System.out.println("The title of the page :"+title);
		
		String current_url = driver.getCurrentUrl();
		System.out.println("The current url is: "+current_url);
		
		//System.out.println(driver.getPageSource());
		
		WebElement text = driver.findElement(By.xpath("//h1[@id='headingText']"));
		System.out.println(text.getText());
		
		System.out.println("The input value is "+email_id.getAttribute("value"));
		
		/*
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		*/
		
		boolean element = driver.findElement(By.xpath("//span[text()='Next']")).isDisplayed();
		System.out.println("The given element is: "+element);
		
		
	}

}
