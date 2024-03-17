package selenium_course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_class {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.myntra.com/");
		WebElement tareget_men=driver.findElement(By.xpath("//a[text()='Men']"));
		new Actions(driver).moveToElement(tareget_men).build().perform();
	}
	}
	
	