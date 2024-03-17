package selenium_course;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait_timerbutton 
{

	public static void main(String[] args) {
	
	
	  WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.navigate().to("https://omayo.blogspot.com/");	
		WebDriverWait wait1 =new WebDriverWait(driver,Duration.ofSeconds(40));
		

		
		WebElement button=wait1.until(ExpectedConditions.elementToBeClickable(By.id("[id='timerButton']")));
		button.click();
		
		
}
	
}