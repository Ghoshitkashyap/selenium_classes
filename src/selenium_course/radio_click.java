package selenium_course;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class radio_click extends base_class{

	public static void main(String[] args) throws InterruptedException {
	
preCondition();
driver.get("https://demowebshop.tricentis.com/");
List<WebElement> community_poll=driver.findElements(By.cssSelector("input[type='radio']"));

for(WebElement web: community_poll) {
	web.click();
	Thread.sleep(2000);
}
	
	}

}
