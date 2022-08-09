package automation555555;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_display {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//label[@class='_58mt'])[3]")).click();
	Thread.sleep(2000);
		WebElement result = driver.findElement(By.xpath("(//input[@name='custom_gender'])"));
		Thread.sleep(2000);
	
		boolean display=result.isDisplayed();
	System.out.println(display);
		}
}
