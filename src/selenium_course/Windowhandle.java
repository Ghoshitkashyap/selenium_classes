package selenium_course;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(1000);
		Set<String> child = driver.getWindowHandles();//
		System.out.println(child);
		for (String str : child) {
			driver.switchTo().window(str);
			Thread.sleep(2000);
			
		}
		
		
		
		
		
		

	}

}
