package selenium_course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver Demo = new ChromeDriver();
  Demo.manage().window().maximize();
  Demo.get("https://demowebshop.tricentis.com/");
  //Demo.findElement(By.partialLinkText("Apparel")).click();
 // Demo.close();
	}

}
