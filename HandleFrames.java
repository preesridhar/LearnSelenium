package seleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
        driver.switchTo().alert().sendKeys("Preethi Sridharan");
        driver.switchTo().alert().accept();
        String text=driver.findElement(By.id("demo")).getText();
        if(text.contains("Hello Preethi Sridharan! How are you today?")) {
        	System.out.println("test is passed");
        } else
        	System.out.println("test is failed");
	}

}
