package meet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//WebElement abc =driver.findElement(By.name("field-keywords"));
	
		//abc.sendKeys("mobiles");
		//driver.findElement(By.className("nav-inputnav-progressive-attribute")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("Amazon miniTV")).click();
		//Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Amazon mi")).click();
		Thread.sleep(2000);

		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		//driver.getWindowHandle();
		//driver.getWindowHandles();
		driver.quit();
		

	}

}
