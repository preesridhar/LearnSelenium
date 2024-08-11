package seleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1.select single checkbox
		driver.findElement(By.xpath("//input[@id='female']")).click();
		
		//2.count total number of check boxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("total number of checkboxes: " + checkboxes.size());
		
		//3.select all the checkboxes using for each loop
		
		/*for(WebElement check:checkboxes) {
			check.click();
		}*/
		
		//4.select all check boxes using for loop
		/*for(int i=0;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}*/
		
		//5.select last 3 checkboxes. total number of checkboxes- no of checkboxes to be slected
		//7-3=4. so index value should be 4
		
		/*for(int i=4;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
			
		}*/


       //6.select check boxes which are unselected and unselect checkboxes which are selected
		
		for(WebElement tick:checkboxes) {
			if(tick.isSelected()) {
				tick.click();
			}else {
				tick.click();
			}
		
			
		//7. Select checkboxes randomly.
			
			for(int i=0;i<checkboxes.size();i++) {
				if(i==0 || i==2|| i==4) {
					checkboxes.get(i).click();
				}
				
			}
			
		}
		
	}
}
	

