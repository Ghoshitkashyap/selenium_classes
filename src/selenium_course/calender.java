package selenium_course;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class calender {
	public static void main(String[] args) throws InterruptedException {
				WebDriver driver = new ChromeDriver();
				 driver.manage().window().maximize();
				
				Thread.sleep(2000);
				driver.navigate().to("https://www.agoda.com/");	
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
				
				driver.findElement(By.xpath("//div[@data-element-name='check-in-box']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[@data-selenium-date='2024-03-24']")).click();
				
				Thread.sleep(2000);
				for (;;) {
					try {
						driver.findElement(By.xpath("//span[@data-selenium-date='2024-10-24']")).click();// no such exception handle krne k liye
						break;
					}
					catch(Exception e) {
						driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
						
					}
				}
				

	}

}
