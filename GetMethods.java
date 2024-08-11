package seleniumAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		
		 //to open the url in the browser
		driver.get("http://www.amazon.in");
		
		//returns the title of the webpage
		System.out.println(driver.getTitle());
		
		//returns current url of the webpage
		System.out.println(driver.getCurrentUrl());
		
		//returns source code of the page
		//System.out.println(driver.getPageSource());
		
		//returns id of the single browser window
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.linkText("Sign in")).click();
		
		//return id of the multiple browser windows
		Set<String> windowIds=driver.getWindowHandles();
		System.out.println("window IDs are: " + windowIds);

	}

}
