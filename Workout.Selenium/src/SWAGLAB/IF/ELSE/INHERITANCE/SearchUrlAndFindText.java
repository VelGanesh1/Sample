package SWAGLAB.IF.ELSE.INHERITANCE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import SWAGLAB.IF.ELSE.INHERITANCE.Browser;

import org.openqa.selenium.WebDriver;

public class SearchUrlAndFindText extends Browser {
	
	Browser a = new SWAGLAB.IF.ELSE.INHERITANCE.Browser();
	
	WebDriver driver;
	
	public void SearchUrlAndFindText() throws IOException, Throwable {
		SearchUrlAndFindText c = new SearchUrlAndFindText();
		a.Browser();
		c.SearchUrlAndFindText();
		System.out.println("Your are Searching SwagLob Website:");
		Properties Search = new Properties();
		Search.load(new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Workout.Selenium\\src\\SWAGLAB\\IF\\ELSE\\INHERITANCE\\Search.properties"));
		String url = Search.getProperty("Url");
		String websitename = Search.getProperty("Search");
		if(url.equals("Url")) {
			a.Browser();
			driver.manage().window().minimize();
			driver.get("https://www.google.com/");
			c.driver.get("https://www.google.com/");
		}
		else {
			System.out.println("You are entering wrong Url website:");
		}
	}
public static void main (String[]args) {

}
}
