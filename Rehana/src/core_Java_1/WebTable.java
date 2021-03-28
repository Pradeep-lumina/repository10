package core_Java_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://shareselenium.herokuapp.com/WebTable.html");

		WebElement table = driver.findElement(By.xpath("//table[@cellspacing='0']"));
			
		List<WebElement> rows= driver.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		for(WebElement row:rows)
		{
			List<WebElement> cells = row.findElements(By.tagName("td"));
			
			for(WebElement cell:cells)
			{
				String text = cell.getText();
				System.out.println(text);
			}
		}
		
	}

}
