package seleniumAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//to navigate to url by passing string
		driver.navigate().to("https://w3schools.com/sql/sql_syntax.asp");
		driver.findElement(By.partialLinkText("Get your own SQL Server")).click();
		
		// to navigate to url using object
		//URL myUrl=new URL("http://www.amazon.in");
		//driver.navigate().to(myUrl);
		
		//driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		// to navigate to back webpage
		driver.navigate().back();
		
		//to navigate to forward webpage
		driver.navigate().forward();
		
		//to refresh the webpage
		driver.navigate().refresh();
		
		
		Set<String> windowIDs=driver.getWindowHandles();
		System.out.println(windowIDs);
		
		List<String> id = new ArrayList(windowIDs);
		String parentId =id.get(0);
		String childId =id.get(1);
		
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		
		for(String winid : id) {
		String title=driver.switchTo().window(winid).getTitle();
			if(title.equals("SQL Syntax")) {
				driver.close();
			}
			
					
		}
		
	}

}
