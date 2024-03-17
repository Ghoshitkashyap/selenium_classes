package bike_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BMW {
@Test 
public void bMW(){
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.bmw-motorrad.in/en/models/modeloverview.html");
		driver.manage().window().maximize();
		driver.close();
		Reporter.log("bmw",true);
}
}