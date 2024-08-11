package seleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlesDropdown {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 
		 /*driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		  * 
		 //select country using select class
		 WebElement country=driver.findElement(By.xpath("//select[@id='country-list']"));
		 Select countries=new Select(country);
		 countries.selectByVisibleText("India");
		 //countries.selectByIndex(5);
		 
		 //2) to count total no of options
		 List<WebElement> options =countries.getOptions();	
		 System.out.println("Total no of options: "+ options.size());
		 
		 //3). Print all the options
		 for(WebElement op:options) {
			 System.out.println(op.getText());
		 }*/
		 
		 //hidden Dropdown
		 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		driver.findElement(By.xpath("//span[text()='Full-Time Permanent']")).click();
		
		
		 }
		 
		 

	}

