package selenium_course;

import org.openqa.selenium.By;

public class xPath_demo extends base_class{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		preCondition();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
		
		
	}

}
