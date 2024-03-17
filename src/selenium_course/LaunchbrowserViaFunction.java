package selenium_course;

public class LaunchbrowserViaFunction extends base_class{

	public static void main(String[] args) {
		preCondition();
		driver.get("https://demowebshop.tricentis.com/");
		postCondition();

	}

}
