package selenium_course;


	//	package selenium_course;
		import java.awt.AWTException;
		import java.awt.Robot;
		import java.awt.event.KeyEvent;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class robotclass_textsend{

			
				// TODO Auto-generated method stub


					public static void main(String[] args) throws InterruptedException, AWTException {
						
						WebDriver driver = new ChromeDriver();
						 driver.manage().window().maximize();
						
						Thread.sleep(2000);
						driver.navigate().to("https://demowebshop.tr.com/");
						Thread.sleep(5000);
						Robot rbt=new Robot();
						rbt.keyPress(KeyEvent.VK_TAB);
						Thread.sleep(1000);
						rbt.keyPress(KeyEvent.VK_TAB);
						Thread.sleep(1000);
						rbt.keyPress(KeyEvent.VK_TAB);
						Thread.sleep(1000);
						rbt.keyPress(KeyEvent.VK_TAB);
						Thread.sleep(1000);
						rbt.keyPress(KeyEvent.VK_TAB);
						Thread.sleep(1000);
						
						rbt.keyPress(KeyEvent.VK_M);
						rbt.keyPress(KeyEvent.VK_A);
						rbt.keyPress(KeyEvent.VK_N);
						rbt.keyPress(KeyEvent.VK_U);
						
						rbt.KeyRelease(KeyEvent.VK_TAB);
						rbt.KeyRelease(KeyEvent.VK_M);
						rbt.keyPress(KeyEvent.VK_A);
						rbt.keyPress(KeyEvent.VK_N);
						rbt.keyPress(KeyEvent.VK_U);
						
						
						
						
						rbt.keyRelease(KeyEvent.VK_TAB M);
						rbt.keyRelease(KeyEvent.VK_ENTER);
						
						
						
						
			}

		}


	}

}
