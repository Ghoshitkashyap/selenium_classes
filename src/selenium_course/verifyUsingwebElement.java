package selenium_course;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class verifyUsingwebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 String givenUrl="https://demowebshop.tricentis.com/";
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		//String current=driver.getCurrentUrl();
		String current_url =driver.getCurrentUrl();
		if(givenUrl.equalsIgnoreCase(current_url))
		{
			WebElement	digital_download=driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
			System.out.println("Script is success");
			digital_download.click();
			WebElement sort=driver.findElement(By.id("products-orderby"));
			Select s_ref=new Select(sort);// for dropdown menu sort by 
			List<WebElement> option = s_ref.getOptions();//	return all dropdown values
			int i=0;
			for (WebElement web : option) {
				sort=driver.findElement(By.id("products-orderby"));//this line is used to handle stale element--jaise hum sort kr rhe h to page refresh hota hai uske liye ye conditon laga deni h
				s_ref=new Select(sort);//this line is used to handle stale element
				s_ref.selectByIndex(i++);
				Thread.sleep(1000);
				
			}
		}
		
		else
			System.out.println("not success");

	}

}
