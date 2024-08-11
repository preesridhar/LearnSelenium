package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		
		// to locate element using cssSelector with tag id.
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("T-shirts");
		
		// to locate element using cssSelector with tag className.
		driver.findElement(By.cssSelector("input.nav-input")).sendKeys("Kurtis for women");
		
		//to locate element using cssSelector with tag attribute. we can use single quotation as well.
		driver.findElement(By.cssSelector("input[placeholder=\"Search Amazon.in\"]")).sendKeys("Watch for women");
		
		driver.findElement(By.linkText("Sign in")).click();
		// to locate element using cssSelector with tag class attribute.
		driver.findElement(By.cssSelector("input.a-input-text[name=\"email\"]")).sendKeys("preethisridhar@gmail.com");
		
	}

}
