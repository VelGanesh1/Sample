package Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitFunction {
	public static void main (String []args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\Chromedriver.exe");
		WebDriver Ganesh = new ChromeDriver();
		Ganesh.get("https://www.google.com/");
		Ganesh.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
}
