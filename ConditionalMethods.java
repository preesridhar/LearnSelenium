package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		//isDisplayed() method returns boolean value
		boolean status =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(status);
		
		//isEnabled() method
		boolean status1= driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(status);
		
		if (status1==true) {
			driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Preethi");
			
		}
		
		//isSelected() method
		boolean Gender=driver.findElement(By.xpath("//input[@id='gender-female']")).isSelected();
		System.out.println(Gender);
		if(Gender==false) {
			driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		}
		
	
	}

}
