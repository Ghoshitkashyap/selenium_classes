package selenium_course;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_class{
public static void main(String[]args) throws InterruptedException
{


	WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/hp/Downloads/demo.html");
	WebElement singleDropdown=driver.findElement(By.id("standard_cars"));
	 Select s_ref=new Select(singleDropdown);//non static method object creation_when we need to select drop dropdown
	List<WebElement> cars =s_ref.getOptions();//collection of data stored in cars web element
	System.out.println(cars);// total 12 cars value printed
	int i=0;
	for (WebElement web: cars) {
		s_ref.selectByIndex(i++);
		//web.click();
		Thread.sleep(1000);
	}
	
}
}
