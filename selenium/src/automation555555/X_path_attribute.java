package automation555555;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_attribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		//	driver.get("https://www.google.com/");
		//	 Thread.sleep(2000);
			 driver.get("https://www.facebook.com/");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tejaswinifulzele8668@gmail.com");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9860345688");
			 Thread.sleep(2000);
			 //driver.findElement(By.xpath("//button[@value='1']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@type='text']")).clear();
		}

}
