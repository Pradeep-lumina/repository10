package core_Java_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		try {
			
			File src = new File("C:\\Users\\FITA\\Desktop\\value.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheetAt(0);
			
			for(int i=1; i<=sh.getLastRowNum(); i++)		
			{
				String un = sh.getRow(i).getCell(0).getStringCellValue();
				String pwd = sh.getRow(i).getCell(1).getStringCellValue();
				
				WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
				username.sendKeys(un);
				Thread.sleep(2000);
				
				WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
				password.sendKeys(pwd);
				Thread.sleep(2000);
				
			}
			
			FileOutputStream fos = new FileOutputStream(src);
			fos.close();
		}
		
		catch(Exception e)
		{
				System.out.println(e.getMessage());
		}
	}

}
