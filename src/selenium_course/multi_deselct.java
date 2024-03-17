package selenium_course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multi_deselct {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("file:///C:/Users/hp/Downloads/demo.html");
		driver.findElement(By.id("standard_cars"));
	}
	

}
