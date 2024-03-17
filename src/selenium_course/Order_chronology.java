package selenium_course;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Order_chronology {

@org.testng.annotations.BeforeSuite
public void BeforeSuite()
{
	System.out.println("before suite");
}
@BeforeTest
public void BeforeTest()
{
	System.out.println("BeforeTest");
	
}
@org.testng.annotations.BeforeClass
public void BeforeClass()
{
	System.out.println("Beforeclass");
}


@Test
public void Test()
{
	System.out.println("Test");
}

@org.testng.annotations.AfterMethod
public void AfterMethod()
{
	System.out.println("aftermethod");
}


}
