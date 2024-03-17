package selenium_course;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class shoppingcart_validation extends base_class {

	public static void main(String[] args) {
		preCondition();
	
	
		String given_url= "https://demowebshop.tricentis.com/books";//this is url we have to verify
	
		String current_url=driver.getCurrentUrl();
		driver.get("https://demowebshop.tricentis.com/books");//we are going to --redirection
		
		if(given_url.equalsIgnoreCase(current_url)) {
			
			WebElement price=driver.findElement(By.xpath("(//a[text()='Fiction'])/../../div[3]/div/span[2]"));
			System.out.println("iam on book fiction page");//if both url are getting matched then then if condition will run
			System.out.println(price.getText());
			driver.close();
		}
		
		else
			System.out.println("iam not on book page");

	}

}
