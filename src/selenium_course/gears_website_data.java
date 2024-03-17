package selenium_course;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class gears_website_data {

	public static void main(String[] args) {
		
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.navigate().to("https://www.dream11.com/");	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    driver.get("https://www.skillrary.com/");
		
	//	driver.findElement(By.xpath("[class=\"menu_container\"]")).click();
		
		Actions a= new Actions(driver);
	    WebElement gear=driver.findElement(By.xpath("[class=\"menu_container\"]"));
		// a.moveToElement(gear);
		 
		gear.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;//switch handle to child window in the gear website
		
		//	js.executeScript("window.scrollTo(0,2000);");
			//js.executeScript("arguments[0].value='kashyap';", window64);
		//	window64.click();
			

	}

}