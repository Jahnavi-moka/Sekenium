package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("mokajahnavi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		WebElement password = driver.findElement(By.name("password"));
		password .sendKeys("Remote2022@");
		driver.findElement(By.id("signInSubmit")).click(); 
		Thread.sleep(2000);
		driver.quit();
		
	}
}
