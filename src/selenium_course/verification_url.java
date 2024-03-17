package selenium_course;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class verification_url extends base_class {

	public static void main(String[] args) {
		
		preCondition();
		String given_url= "https://demowebshop.tricentis.com/";
		driver.get("https://demowebshop.tricentis.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equalsIgnoreCase(current_url)) {
			System.out.println("iam on dws page");
			List<WebElement> tabs=driver.findElements(By.className("input[type='radio']"));
			driver.close();
		}
		
		else
			System.out.println("iam not on dws page");
		
		
		//driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click(); //contains text 
	}

}
