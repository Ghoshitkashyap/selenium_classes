package bike_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ducati {
@Test 
public void ducati(){
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.ducati.com/se/sv/home?gad_source=1&gclid=CjwKCAiA0bWvBhBjEiwAtEsoW8_WKehE975OAZcFgnEArEm6xKe6tcGEYcmkpYDMbI7PoZtAHzPrZRoCS1YQAvD_BwE");
	
		driver.manage().window().maximize();
		driver.close();
		Reporter.log("ducati",true);
}
}