package popup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class total_link2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));  
		Thread.sleep(2000);
		System.out.println(links.size());
		
	    for(int a=0; a<links.size(); a++)
	    {
	    	System.out.println(links.get(a).getText()+":"+links.get(a).getAttribute("href"));
	    }
		driver.quit();

	}
}
