package mouseoveractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.PublicApi;

public class MouseoverActions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 WebElement courses = driver.findElement(By.className("_2puWtW _3a3qyb"));
	 courses.click();
	 
 }
}
