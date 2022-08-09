package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkey {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		WebElement ele = driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = alt.getText();
		
		System.out.println(text);
		Thread.sleep(2000);
		alt.sendKeys("velocity");

	
		alt.accept();
	}

}
