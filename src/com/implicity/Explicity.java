package com.implicity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicity {

	public static void main(String[] args) {
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//WebDriverwait wait = new WebDriverwait(driver,Duration.ofSeconds(5));
		//driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("jahnavi");
		//driver.findElement(By.xpath("//a[@data-csa-c-type='link']")).click();
		//sendKeys("mokajahnavi");
		driver.get("https://testproject.io/");
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.)
		
	}
}
		//WebDriverWait wait = new webDriver wait(driver.Duration of seconds(5));*/
		
 WebDriver driver = new ChromeDriver();
 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
 driver.manage().window().maximize();
 driver.get("http://omayo.blogspot.com/");
 driver.findElement(By.id("timerButton")).click();
	}
}

 
	