package selenium_course;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.dream11.com/");	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			WebElement phone=driver.findElement(By.id("send-sms-iframe"));
			driver.switchTo().frame("Phone");
			driver.findElement(By.id("regEmail")).sendKeys("55555");
			
			
			
			
	}

}
