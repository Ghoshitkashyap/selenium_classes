package selenium_course;

import org.openqa.selenium.By;

public class Addtocart extends base_class {

	public static void main(String[] args) {
		
		preCondition();
		driver.get("https://demowebshop.tricentis.com/");
		String title="demo web page";
		String given_url="https://demowebshop.tricentis.com/";
		
		if(title.equalsIgnoreCase(driver.getTitle())) {
			
			System.out.println("matched");
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[2]/div/div[2]/div[3]/div[2]/input"));
			String givenTitle="https://demowebshop.tricentis.com/25-virtual-gift-card";
			
			//if(title.equalsIgnoreCase(driver.getTitle()
					{
					
		}
		//	else {
				}
			}
	//	else
		{
			System.out.println("not correct");
			
		}
		
		
		
		


	}


