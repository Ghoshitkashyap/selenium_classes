package selenium_course;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Notificstion_popup {

	
		// TODO Auto-generated method stub


			public static void main(String[] args) throws InterruptedException, AWTException {
				
				WebDriver driver = new ChromeDriver();
				 driver.manage().window().maximize();
				
				Thread.sleep(2000);
				driver.navigate().to("https://easemytrip.com/");
				Thread.sleep(5000);
				Robot rbt=new Robot();
				rbt.keyPress(KeyEvent.VK_TAB);
				Thread.sleep(1000);
				rbt.keyPress(KeyEvent.VK_TAB);
				Thread.sleep(1000);
				rbt.keyPress(KeyEvent.VK_TAB);
				Thread.sleep(1000);
				rbt.keyPress(KeyEvent.VK_ENTER);
				
				rbt.keyRelease(KeyEvent.VK_TAB);
				rbt.keyRelease(KeyEvent.VK_ENTER);
				
				
				
				
	}

}
