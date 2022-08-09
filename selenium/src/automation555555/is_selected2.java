package automation555555;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_selected2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		 Thread.sleep(2000);
         WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
         male.click();
	     Thread.sleep(2000);
		 boolean result = male.isSelected();
		 System.out.println(result);
		  if(result==true) {
			System.out.println("element selected");
		}
		 else {
			System.out.println("element not selected");
		}
	}

}
