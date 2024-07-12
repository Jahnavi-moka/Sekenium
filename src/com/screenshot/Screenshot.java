package com.screenshot;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.misc.Utils;

public class Screenshot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		//String time = LocalDateTime.now().toString().replace(":","-");
		TakesScreenshot ts =(TakesScreenshot) driver;
		File amazon = ts.getScreenshotAs(OutputType.FILE);
		File save = new File("\"C:\\Users\\moka jahnavi\\OneDrive\\Desktop\\f\"");
		File utils.copyFile(amazon,save);
		System.out.println("Screenshot");
		driver.quit();
		
		

	}

}
