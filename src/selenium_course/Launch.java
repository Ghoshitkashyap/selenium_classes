package selenium_course;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch {
@Test (priority=0)
public void redbus(){
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.redbus.in/");
	
		driver.manage().window().maximize();
		driver.close();
		Reporter.log("redbus",true);
}
@Test (priority=0, invocationCount=2,threadPoolSize=3)
public void flipkart(){
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	
	
		driver.manage().window().maximize();
		driver.close();
		Reporter.log("redbus",true);
}
@Test (priority=2)
public void Amazon(){
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("	 https://www.amazon.in/ref=nav_logo");
	
		 
		driver.manage().window().maximize();
		driver.close();
		Reporter.log("redbus",true);
}
}
	


