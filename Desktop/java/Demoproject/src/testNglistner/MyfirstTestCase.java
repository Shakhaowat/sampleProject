package testNglistner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testNglistner.testNGlistener.class)
public class MyfirstTestCase
{
 
  @Test
  public void Googleverify()
  {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
	driver.close();
	
	  
	  
  }
}