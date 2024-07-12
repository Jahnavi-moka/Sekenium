package com.javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(4000);
		//WebElement element = (WebElement) jsexecutor.executeScript("return document.getElementById('email');");
		//element.sendKeys("mokajahnavi");
		
		//WebElement element2 =(WebElement) jsexecutor.executeScript("return document.getElementsByClassName('inputtext _55r1 _6luy');");
		//element2.sendKeys("mokajahnavi");
		//Thread.sleep(2000);
		
	
		//WebElement element3 = (WebElement) jsexecutor.executeScript("return document.evaluate(//input[@id='email'],document,null,XpathResult.FIRST_ORDERED_NODE_TYPE,NULL).singlenodevalue;");
		//element3.sendKeys("mokajahnavi");
		//Thread.sleep(4000);
		//WebElement elem =(WebElement) jsexecutor.executeScript("return document.getElementById('email').value = 'mokajahnavi';");
		//Thread.sleep(1000);
		WebElement element =(WebElement)jsexecutor.executeScript("return document.getElementByname('email').style.border='10px red';");
		
		driver.quit();
		WebElement element = WebElement jsexecutor.executeScript("return"))
}
}
