package SampleMavenProject.SampleMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility_Maven {
	public static WebDriver driver;
	public static void browserlaunch()
	{
		String driverPath = System.getProperty("user.dir")+"\\src\\main\\java\\Browser\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void launchApp(String url)
	{
		driver.get(url);
	}
}
