package automation555555;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screen_shot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\ASUS\\Desktop\\screenshot\\abc234.jpg");
            FileHandler.copy(source, dest);
}
}
