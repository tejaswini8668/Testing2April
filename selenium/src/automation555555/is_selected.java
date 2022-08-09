package automation555555;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_selected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			//driver.get("https://www.google.com/");
			driver.get("https://www.facebook.com/r.php");         // fb sign up page
			Thread.sleep(2000);
			WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			Thread.sleep(2000);
			boolean result = female.isSelected();
			System.out.println(result);
			
			
		}
}
