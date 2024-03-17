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

public class Explicit_waiting {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.navigate().to("https://omayo.blogspot.com/");	
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		
		WebElement dropdown=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='dropbtn']")));
		dropdown.click();
		WebElement dropdown1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Flipkart']")));

		dropdown1.click();

	}

}
