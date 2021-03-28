package core_Java_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		ChromeOptions browser = new ChromeOptions();
		browser.addArguments("Headless browser testing");
		WebDriver driver = new ChromeDriver(browser);
		
		driver.manage().window().maximize();
		
		driver.get("https://shareselenium.herokuapp.com/Alerts.html");
		
		WebElement element = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		element.click();
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		WebElement confirm_box = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		confirm_box.click();
		
		alt.dismiss();
		
		WebElement prompt_box = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		prompt_box.click();
		Thread.sleep(2000);
		
		alt.sendKeys("Testing");
		alt.accept();

	}

}
