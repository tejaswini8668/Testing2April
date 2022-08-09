package automation555555;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_contains {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
//	 		driver.get("https://www.flipkart.com/");
		  //  Thread.sleep(2000);
//	        driver.findElement(By.xpath("(//input[contains(@autocomplete,'off')])[2]")).sendKeys("tejaswinifulzele8668");
		   
			
			driver.get("https://www.facebook.com/");
		   
			Thread.sleep(2000);
		    driver.findElement(By.xpath("(//input[contains(@class,'ext')])[1]")).sendKeys("teju");   //contains attribute email 
	     
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//a[contains(text(),'go')]")).click();                        //contains text forgot pass
		    
		   Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[contains(@type,'word')]")).sendKeys("9860345688");   //contains attribute password
	}
	
	
}