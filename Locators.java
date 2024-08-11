package seleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		
		WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Mac Book");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//to get multiple links
		List<WebElement >totalLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links in this page: "+ totalLinks.size());
		
		List<WebElement> images= driver.findElements(By.tagName("img"));
		System.out.println("Total no of images:" + images.size());
		
		driver.findElement(By.linkText("Dell 15 Thin & Light Laptop, 12th Gen Intel Core i5-1235U Processor, 8GB, 512GB SSD, 15.6\" (39.62cm) FHD Display, Windows 11 + MSO'21, 15 Month McAfee Antivirus, Black, Spill-Resistant Keyboard,1.66kg")).click(); 
		
		
		
		
		
	}

}
