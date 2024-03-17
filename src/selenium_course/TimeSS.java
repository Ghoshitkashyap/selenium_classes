
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TimeSS {

	public static void main(String[] args) throws IOException {
		LocalDateTime date=LocalDateTime.now();
		
		
		//web page screenshot program
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.navigate().to("https://www.dream11.com/");	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/computers");
			 TakesScreenshot ts =(TakesScreenshot)driver;
			// List<WebElement> Electronics= driver.findElements(By.xpath("//a[contains(text(),'Electronics')]"));
			 File from =ts.getScreenshotAs(OutputType.FILE);
			 File to= new File("C:\\Users\\hp\\Pictures\\Screenshots\\computers.png");
			FileHandler.copy(from, to);
			

	}

}