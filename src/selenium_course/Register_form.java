package selenium_course;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Register_form extends base_class {

	public static void main(String[] args) throws InterruptedException {
		
		preCondition();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
	//	((WebElement) driver.findElements(By.id("radio"))).click();
		
	//	List<WebElement> community_poll=driver.findElements(By.id("input[type='radio']"));// concept revise needed
		
		driver.findElement(By.id("FirstName")).sendKeys("Joy");
	
	    driver.findElement(By.id("LastName")).sendKeys("Lobo");
	
		driver.findElement(By.id("Email")).sendKeys("joy.lobo@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("joylobo");
	
		driver.findElement(By.id("ConfirmPassword")).sendKeys("joylobo");
		
		driver.findElement(By.id("register-button")).click();
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.className("email")).sendKeys("joy.lobo@gmail.com");
		driver.findElement(By.className("password")).sendKeys("joylobo");
		driver.findElement(By.linkText("Log in")).click();//login button click not working
	}

}
