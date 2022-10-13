package SWAGLAB.IF.ELSE.INHERITANCE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser extends SwagLab {
	
	
	
	public void Browser() throws IOException, Throwable{
		Properties browser = new Properties();
		browser.load(new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Workout.Selenium\\src\\SWAGLAB\\IF\\ELSE\\INHERITANCE\\Browser.properties"));
		String Properties = browser.getProperty("Browser");
		System.out.println("Your are using:- " + browser.getProperty("Browser") + " Browesr");
		WebDriver d = new ChromeDriver();
		
		if (Properties.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", ".\\DriverLocation\\Chromedriver.exe");
		//	WebDriver b = new ChromeDriver();
			d.manage().window().maximize();
		}
		else if(Properties.equals("MicroSoft Edge")) {
			System.setProperty("webdriver.edge.driver", ".\\DriverLocation\\msedgedriver.exe");
			//WebDriver b = new EdgeDriver();
			d.manage().window().maximize();
		}
		else {
			System.out.println("Your are not using Chrome Browser");
			return;
		}
	}

}
