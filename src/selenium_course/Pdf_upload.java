package selenium_course;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Pdf_upload {
	public static void main(String[] args) throws InterruptedException {
				WebDriver driver = new ChromeDriver();
				 driver.manage().window().maximize();
				
				Thread.sleep(2000);
				driver.navigate().to("https://demo.automationtesting.in/Alerts.html");	
				driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

	}

}
