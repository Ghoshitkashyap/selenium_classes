package selenium_course;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Take_screenshot {

	public static void main(String[] args) throws IOException {
		
		//web page screenshot program
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.navigate().to("https://www.dream11.com/");	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/computers");
			 TakesScreenshot ts =(TakesScreenshot)driver;//upcast
			 File from =ts.getScreenshotAs(OutputType.FILE);
			 File to= new File("C:\\Users\\hp\\Pictures\\Screenshots\\computers.png");
			FileHandler.copy(from, to);
			

	}

}
