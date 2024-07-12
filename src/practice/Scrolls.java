package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolls {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		JavascriptExecutor jsexecutor = (JavascriptExecutor)driver;
		//jsexecutor.executeScript("window.scrollTo(0,1000);");
		Thread.sleep(1000);
		//jsexecutor.executeScript("window.scrollBy(0.8000");
		//WebElement element = (WebElement)jsexecutor.executeScript("return document.getElementsByClassName('ty-bonos-entry');");
		//element.click();
		jsexecutor.executeScript("window.scrollTo(0,document.body.scrollheight);");
	}

}
