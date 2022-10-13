package SWAGLAB.PROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface ChromeLunach {
	public static void main(String[]args) {
		System.setProperty("wendriver.chrome.driver", ".\\DriverLocation\\Chromedriver.exe");
		WebDriver Ganesh = new ChromeDriver();
	}

}
