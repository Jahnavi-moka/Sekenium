package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("email")).sendKeys("mokajahnavi@gmail.com");
		WebElement abc = driver.findElement(By.id("continue"));
		String def = abc.getCssValue("background-color");
		Thread.sleep(2000);
		System.out.println("def");
		driver.quit();

		
	}

}
