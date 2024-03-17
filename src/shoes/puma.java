package shoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class puma{
@Test 
public void Puma(){
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://in.puma.com/in/en?utm_source=GGL-SEA&utm_medium=BS&utm_aud=OTH&utm_obj=OLC&utm_campaign=BS_GGL_IN_BS_GGL_SEA_TXT_Brand-Exact_agency_1000067495857508873&gad_source=1&gclid=CjwKCAiA0bWvBhBjEiwAtEsoW_5CKRPnTXJX_32hk2XeuhuC2ARjs2OuoNlcJ0cylXCHsZgKJI6MxhoCldsQAvD_BwE");
		driver.manage().window().maximize();
		driver.close();
		Reporter.log("puma",true);
}
}