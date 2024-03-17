package selenium_course;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class custom_hiddenText {

	public static void main(String[] args) {
		
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.navigate().to("https://www.dream11.com/");	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
			WebElement window64 = driver.findElement(By.xpath("//input[@name='custom_gender']"));
			JavascriptExecutor js=(JavascriptExecutor) driver;
		
			js.executeScript("window.scrollTo(0,2000);");
			js.executeScript("arguments[0].value='kashyap';", window64);
			window64.click();
			

	}

}
