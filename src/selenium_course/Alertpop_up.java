package selenium_course;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Alertpop_up
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");	
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(3000);
		Alert art=driver.switchTo().alert();
		art.accept();
		
		driver.findElement(By.xpath("//button[@cclass='analystic\']")).click();	
		driver.findElement(By.xpath("//button[@cclass=\'btn btn-primary\']")).click();
		Thread.sleep(3000);
		Alert art1=driver.switchTo().alert();
		art1.accept();
		
		
		
		

	}

}
