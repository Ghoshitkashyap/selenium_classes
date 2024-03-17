package shoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class hushpuppies{
@Test(groups = "smoke" )
public void Hushpuppies(){
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.h-ushpuppiesindia.com/");
		driver.manage().window().maximize();
		driver.close();
		Reporter.log("nike",true);
}
}
