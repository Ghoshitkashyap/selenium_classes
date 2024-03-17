package selenium_course;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class {
	public static WebDriver driver;//just like int a || global bana diya so that sab jagah access mil jaaye

public static void preCondition() 
  {
  driver = new ChromeDriver();//object create kr diya so that chromedriver all property driver me aajaye
  driver.manage().window().maximize();
	}

public static void postCondition() 
{
  driver.close();
	}
}

