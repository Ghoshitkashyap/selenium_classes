package selenium_course;
//package selenium_course;

		import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class iframe_test {

			public static void main(String[] args) {
				 WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.navigate().to("https://www.dream11.com/");	
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
					
				driver.findElement(By.linkText("/html/body/a")).click();
					//driver.switchTo().frame("Phone");
					//driver.findElement(By.id("regEmail")).sendKeys("55555");
				//	phone.click();
					driver.navigate().back();
					
					
			}

		}
	}

}
