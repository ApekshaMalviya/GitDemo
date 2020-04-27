package QAPractice.MavenNewProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTest {
	WebDriver driver;
	@Test
	public void URLNEW() {
		System.setProperty("webdriver.chrome.driver", "C://eclipse//Chrome driver_latest//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.close();
}
}
