package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cancle_pop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
	driver.switchTo().alert().dismiss();           //dismiss method
	}
}

