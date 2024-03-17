package selenium_course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver Demo = new ChromeDriver();
  Demo.manage().window().maximize();
  Demo.get("https://www.demowebshop.tricentis.com/");
  Demo.findElement(By.id("small-searchterms")).sendKeys("Help");
  Demo.close();
	}

}
