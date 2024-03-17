import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Data_provider {
	
		@Test (dataProvider="login")   //ye hume particular data access krane k liye hai 
		public void receiver(String email,String Password)
		{

			  WebDriver driver = new ChromeDriver();
				driver .manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			WorkbookFactory
				driver.get("https://demowebshop.tricentis.com/login");
				driver.findElement(By.id("Email")).sendKeys(Password);
				driver.findElement(By.id("RememberMe")).click();
				driver.findElement(By.xpath("//input[@value='Log in']")).click();
				driver.close();
		}

		@DataProvider(name="login")
		
		public Object[][]sender(){
			Object [][] obj=new Object[2][2];
			Obj [0][0] obj="admin@gmail.com";
			Object [][] obj=new Object[2][2];
			Object [][] obj=new Object[2][2];
			Object [][] obj=new Object[2][2];
			
			
			
			
		}
		
		
		
		
		
}