package selenium_course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_submission {

	public static void main(String[] args) {
		
			 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://demo.automationtesting.in/Register.html");	
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Saurabh");
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Singh");
			driver.findElement(By.className("//class=\form-control ng-pristine ng-valid ng-touched")).sendKeys("Singh");

	}

}
