package bike_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ktm_bike {
@Test 
public void Ktm_bike(){
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.ktm.com/en-in.html");
		driver.manage().window().maximize();
		driver.close();
		Reporter.log("ktm",true);
}
}