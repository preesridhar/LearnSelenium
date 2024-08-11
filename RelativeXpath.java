package seleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		//xpath using single attribute
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Women Kurtis");
		
		//xpath using multiple attributes
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button'] [@type='submit']")).click();
		/*List<WebElement> images= driver.findElements(By.tagName("img"));
		System.out.println("total images: " + images.size());*/
		 
		//xpath using AND OR operators
		driver.findElement(By.xpath("//button[@type='button' and @value='S']")).click();
		
		//xpath using text() method
		driver.findElement(By.xpath("//*[text()='Get It by Tomorrow']")).click();
		
	}

}
