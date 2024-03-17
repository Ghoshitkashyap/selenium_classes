package selenium_course;

import org.openqa.selenium.chrome.ChromeDriver;

public class browser_launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ChromeDriver Demo = new ChromeDriver();
  Demo.manage().window().maximize();
  Demo.get("https://www.google.com");
	}

}
