package automation555555;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screen_shot2 {              

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		for(int i=1; i<=10;i++)                    //10 screenshot save
		{
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\ASUS\\Desktop\\screenshot\\Test"+i+".jpg");
			FileHandler.copy(source, dest);
		}
}
}
