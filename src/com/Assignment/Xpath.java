package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();
		//driver.findElement(By.xpath("//a[text()=\"Best Sellers\"]")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Amazon miniTV']")).click();
		
	//Xpath by independent and dependentant
		//driver.get("https://www.amazon.in/Nokia-Payments-Long-Lasting-Wireless-Charcoal/dp/B0C5RK3X6F/ref=sr_1_1?crid=IRKSK7D5YG6P&keywords=nokia%2Bkeypad%2Bmobile%2Bphone&qid=1696918967&sprefix=nokia%2Caps%2C234&sr=8-1&th=1");
		WebElement mobile=driver.findElement(By.xpath("//span[@id='productTitle']/../../../..//span[@class='a-price-whole']"));
		//Thread.sleep(2000);
		
		//mobile.getText();
	//System.out.println("getText()");
		
	//Xpath byAxis (Relations)
		//driver.findElement(By.xpath("//div[@id='a-page']/parent::body")).click();
		
	//Xpath by index
		driver.findElement(By.xpath("//div[@id='nav-belt'][1]")).click();
		Thread.sleep(2000);
		
		
		driver.quit();

}
}
