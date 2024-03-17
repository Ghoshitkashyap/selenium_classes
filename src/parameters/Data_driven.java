package parameters;
	import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class Data_driven {
		
		@Test (dataProvider="login")   
		public void login(String email,String Password)
		{

			  WebDriver driver = new ChromeDriver();//upcast 
				driver .manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			  	driver.get("https://demowebshop.tricentis.com/login");
				driver.findElement(By.id("Email")).sendKeys(Password);
				driver.findElement(By.id("RememberMe")).click();
				driver.findElement(By.xpath("//input[@value='Log in']")).click();
				driver.close();
				}
		
		@DataProvider(name="login")
		public Object[][] sender() throws EncryptedDocumentException, IOException {
		 File file = new File("C:\\Users\\hp\\Desktop\\login.xlsx");
		FileInputStream fis= new FileInputStream(file);//
		Workbook wb =WorkbookFactory.create(fis);
 org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet("sheet1");
//		int row=sheet.getp
return null;
		}
		
	}
