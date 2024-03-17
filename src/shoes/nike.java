package shoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class nike{
@Test 
public void Nike(){
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.nike.com/in/");
		driver.manage().window().maximize();
		driver.close();
		Reporter.log("nike",true);
}
}