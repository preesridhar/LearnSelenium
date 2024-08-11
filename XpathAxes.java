package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		
		// Parent to child
		driver.findElement(By.xpath("//div[@class='nav-search-field ']/child::input")).sendKeys("Iphone 15 Pro");
		
		//child to Parent
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']/parent::div")).click();
		
		//Elder sibling to younger sibling
		driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]/following-sibling::a[1]")).click();

		//younger sibling to elder sibling
		driver.findElement(By.xpath("//a[text()='Mobiles']/preceding-sibling::a[1]")).click();
	
		//Grandparent to Grandchild(descendant)
        driver.findElement(By.xpath("//div[@id='nav-xshop-container']/descendant::a[6]")).click();
		
        //Grandchild to Grandparent(ancestor)
        driver.findElement(By.xpath("//span[text()='Smartwatches']/ancestor::*[3]")).click();
	
	}
	

}
