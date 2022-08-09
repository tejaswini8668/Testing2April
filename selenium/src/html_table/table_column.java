package html_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_column {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> NoOfRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("NoOfRows:"+NoOfRows.size());
//		****************************************************
		for(int i=1; i<NoOfRows.size(); i++)
		{
List<WebElement> noofcell = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
    System.out.println("ROW NO:"+i+"no of cell :"+ noofcell.size());
 
for(int cell=0; cell<noofcell.size(); cell++)  
{
	System.out.print(noofcell.get(cell).getText()+", ");
}
    System.out.println();

	}
    driver.quit();
		

}
}