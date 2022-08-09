package automation555555;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_method {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	//driver.get("https://www.google.com/");
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	 WebElement text = driver.findElement(By.xpath("//form[@class='_9vtf']"));
	 String result = text.getText();
	 System.out.println(result);
}

}
