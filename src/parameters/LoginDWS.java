package parameters;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginDWS {
	
	public class Parameter_basic {
		
		
		@Parameters ({"email","pass"})
		@Test

		public void dws(String email1, String passwrd) {
			  WebDriver driver = new ChromeDriver();
				driver .manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.
				driver.navigate().to("https://demowebshop.tricentis.com/login");
				driver.get(dUrl);
				driver.quit();
					}

	

}
