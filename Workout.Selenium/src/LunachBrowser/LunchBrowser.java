package LunachBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LunchBrowser {

	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\DriverLocation\\chromedriver.exe");
		
		WebDriver Sankar = new ChromeDriver();
		//WebDriver Sankar = new WebDriver();
		Sankar.manage().window().maximize();
		//Sankar.manage().window().minimize();
		
		
		Sankar.get("https://www.youtube.com/watch?v=lHFlAYaNfdo");
		
		Sankar.switchTo().newWindow(WindowType.TAB);
		Sankar.get("https://thegoodnewshub.com/?gclid=Cj0KCQjw94WZBhDtARIsAKxWG-973O45sJNF8vj0dOVYZbrb6B_8dEJsOX7E465jhBoXpZ7sWUYb9hEaAnCMEALw_wcB");
		Sankar.manage().window().fullscreen();
		Thread.sleep(5000);
		System.out.println(Sankar.getCurrentUrl());
		System.out.println(Sankar.getTitle());
		Sankar.quit();
		//System.out.println(Sankar.getPageSource());
		//System.out.println(Sankar.getWindowHandle());
		//System.out.println(Sankar.getClass());
		//Sankar.close();
	}
}
