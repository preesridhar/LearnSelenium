package seleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/alert.xhtml");
		
		//simple/Normal Alert--> has one button to click
		//driver.findElement(By.xpath("//span[text()='Show']")).click();
		//driver.switchTo().alert().accept();
		
		//confirm alert--> has 2 buttons ok & cancel.
		/*driver.findElement(By.xpath("//h5[normalize-space()='Alert (Confirm Dialog)']/following::span")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();*/
		
		//Prompt alert--> with text, ok & cancel
		driver.findElement(By.xpath("//h5[normalize-space()='Alert (Prompt Dialog)']/following::span[2]")).click();
		Alert myAlert=driver.switchTo().alert();
		myAlert.sendKeys("hi Good morning");
		myAlert.accept();
		String result=driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		if(result.contains("hi Good morning")) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test failed");
		}
	}

}
