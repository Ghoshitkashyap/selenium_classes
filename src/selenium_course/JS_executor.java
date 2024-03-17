package selenium_course;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_executor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.navigate().to("https://www.dream11.com/");	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.skillrary.com/");
			JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000;");
	//	Thread.sleep(3000);
			WebElement target=driver.findElement(By.xpath("//h3[text()='Testimonials ']"));
			js.executeScript("window.scrollTo(0,2000);");
			js.executeScript("arguments[0].scrollIntoview(true);", target);

	}

}
