package webelements;//Absolute Xpath

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		//driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[4]/div[2]/div[2]/div[1]/a[3]")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("mokajahnavi@gmail.com");
		//Relative Xpath
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		//text)
		Thread.sleep(2000);
		driver.quit();
		
	}

}
