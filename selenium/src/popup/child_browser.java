package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='button'])[2]")).click(); //click on new tab button 
	Set<String> ids = driver.getWindowHandles();                     // handle mult.window
	ArrayList<String> al = new ArrayList<String>(ids);
	String CWID = al.get(1);                          
	driver.switchTo().window(CWID); //chnge focus to child browser
     Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	Thread.sleep(2000);
    
   driver.switchTo().window(al.get(0));              //focus on main page
  driver.findElement(By.xpath("//input[@value='New Window']")).click();    //inspect new window

	 
	
	
	
}
}
