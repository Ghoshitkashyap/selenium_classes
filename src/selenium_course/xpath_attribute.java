package selenium_course;

import org.openqa.selenium.By;

public class xpath_attribute extends base_class {

	public static void main(String[] args) {
		preCondition();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.xpath("//a[@class='/ico-register']")).click();//absolute_x-path 

		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		
	
	}

}
