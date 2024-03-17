package shoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class adidas{
@Test (groups = "smoke" )
public void Adidas(){
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.adidas.co.in/");
		driver.manage().window().maximize();
		driver.close();
		Reporter.log("nike",true);
}
}
