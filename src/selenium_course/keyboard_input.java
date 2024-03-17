package selenium_course;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_input {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Actions act= new Actions(driver);
		
		act.keyDown(Keys.TAB).keyDown(K)
		
		
	}
	


}}