package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement search = driver.findElement(By.className("nav-input nav-progressive-attribute"));
	//search.click();
	search.sendKeys("makeup kit");
	Thread.sleep(2000);
	
	WebElement linkText = driver.findElement(By.linkText("Sell"));
	linkText.click();
	Thread.sleep(2000);
	
	WebElement A = driver.findElement(By.partialLinkText("Mobi"));
	A.click();
	Thread.sleep(2000);

	}

}
