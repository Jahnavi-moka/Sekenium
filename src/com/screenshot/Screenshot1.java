package com.screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(output.);
		File des = new File ()
		
}
