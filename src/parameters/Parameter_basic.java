package parameters;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameter_basic {
	
	
	@Parameters ({"url","url1"})
	@Test

	public void dws(String dUrl, String dUrl1) {
		  WebDriver driver = new ChromeDriver();
			driver .manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.navigate().to(dUrl);
			driver.get(dUrl1);
			driver.quit();
				}
	@Parameters ({"url","url1"})
	@Test

	public void dws1(String dUrl, String dUrl1) {
		  WebDriver driver = new ChromeDriver();
			driver .manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.navigate().to(dUrl);
			driver.get(dUrl1);
			driver.quit();
				}
}


