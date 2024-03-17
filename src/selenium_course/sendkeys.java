package selenium_course;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sendkeys {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			
			Thread.sleep(2000);
			driver.navigate().to("https://demowebshop.tricentis.com/");
			
			
			WebElement search =driver.findElement(By.id("small-searchterms"));
			Actions acts= new Actions(driver);
		//	for (WebElement web : link) {
				acts.moveToElement(search).click().sendKeys("tshirts are wow").perform();
				acts.keyDown(Keys.TAB).keyDown(Keys.ENTER)
				Thread.sleep(1000);
			}
			
		
			

	}

}
