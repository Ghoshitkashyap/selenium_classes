package selenium_course;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pagedownlinks {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		
		List <WebElement> link =driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		Actions acts= new Actions(driver);
		for (WebElement web : link) {
			acts.keyDown(Keys.LEFT_CONTROL).click(web).build().perform();//alag tab me window khulega
			Thread.sleep(1000);
		}
		
		driver.quit();
		
		
		
	}

}
