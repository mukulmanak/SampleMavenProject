package SampleMavenProject.SampleMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases extends Utility_Maven 
{
	@Test
	public void alaunch  () 
	{
		//browserlaunch ();
	
			String driverPath = System.getProperty("user.dir")+"\\src\\main\\java\\Browser\\chromedriver.exe";
			 
			System.setProperty("webdriver.chrome.driver",driverPath);
			WebDriver driver = new ChromeDriver();
			driver.get("file:///E:/templet/template_7/template_7/index.html");
			driver.manage().window().maximize();
	}
	
	@Test
	public void launch() 
	{
		launchApp("https://www.facebook.com/");
	}
}
