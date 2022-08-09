package select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class list_box4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
	Select s=new Select(year);
	s.selectByVisibleText("1994");
	driver.quit();
}
}
