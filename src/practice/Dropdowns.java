package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.manage().window().timeouts().implicitly wait(Duration.ofSeconds(5));
		
		WebElement Dropdown=driver.findElement(By.xpath("//div[@id='container']"));
		Select A = new Select(Dropdown);
		A.selectByIndex(2);
		
		driver.quit();
	}

}
