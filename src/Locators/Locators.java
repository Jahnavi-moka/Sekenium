package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		WebElement abc = driver.findElement(By.cssSelector("header[id='navbar-main']"));
		abc.sendKeys("Jahnavi");
		abc.click();
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phone");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("");
		Thread.sleep(1000);
		driver.close();
	}
}