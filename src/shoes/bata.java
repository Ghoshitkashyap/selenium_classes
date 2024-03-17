package shoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class bata{
@Test 
public void Bata(){
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.bata.com/in/new/?utm_source=GoogleAdsNeon&utm_medium=Search&utm_campaign=Brand_Bata_Search_TopStates_MxC&gad_source=1&gclid=CjwKCAiA0bWvBhBjEiwAtEsoW6TaJf-4l9Klv5IDlfUvU8Sii6IF_y8-Q3VsTwt-nMA1tlqPzsNItBoC3XkQAvD_BwE");
		driver.manage().window().maximize();
		driver.close();
		Reporter.log("nike",true);
}
}
