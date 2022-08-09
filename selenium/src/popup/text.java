package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class text {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		Thread.sleep(2000);
       Alert abc = driver.switchTo().alert();
      System.out.println(abc.getText());
       Thread.sleep(2000);
      abc.sendKeys("selenium");
    Thread.sleep(2000);
        abc.accept();
	}
}
