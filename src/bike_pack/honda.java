package bike_pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;




public class honda {
@Test 
public void Honda(){
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.honda2wheelersindia.com/");
	
		driver.manage().window().maximize();
		driver.close();
		Reporter.log("honda",true);
}
}