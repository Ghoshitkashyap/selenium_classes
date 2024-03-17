package selenium_course;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Disable_button {

	public static void main(String[] args) {

	
	
	 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.dream11.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
		WebElement window64 = driver.findElement(By.linkText("jdk-11.0.20_windows-x64_bin.exe"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
	
		js.executeScript("window.scrollTo(0,2000);");
		js.executeScript("arguments[0].scrollIntoView(false);", window64);
		window64.click();
		driver.close();


	}

}
