package selenium_course;

import org.openqa.selenium.By;

public class text_function extends base_class {

	public static void main(String[] args) {
		preCondition();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.linkText("Register")).click();
		
		//driver.findElement(By.xpath("//Span[text()='Shopping cart']")).click();//absolute_x-path 
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click(); //contains text 

		

	}

}
