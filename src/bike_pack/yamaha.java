package bike_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class yamaha {
@Test 
public void Yamaha(){
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.yamaha-motor-india.com/yamaha-bikes.html");
		driver.manage().window().maximize();
		driver.close();
		Reporter.log("bmw",true);
}
}