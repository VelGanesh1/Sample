package SearchBrowser;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBrowser {
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\DriverLocation\\chromedriver.exe");
		
		WebDriver newdriver = new ChromeDriver();
		
		newdriver.get("https://www.google.com/");
		//newdriver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("fb" + Keys.ENTER);
		//newdriver.findElement(By.name("q")).sendKeys("fb" + Keys.ENTER);
		newdriver.manage().window().maximize();
		newdriver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("fb" + Keys.ENTER);
		newdriver.findElement(By.linkText("Log into Facebook")).click();
		newdriver.findElement(By.xpath("//input[@id='email']")).sendKeys("8144637828");
		newdriver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcdpqrsyz");
		newdriver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		newdriver.findElement(By.linkText("Friends"));
		//newdriver.findElement(By.xpath("//*[@id='nav-xshop']/a[2]")).click();
		//newdriver.wait(5000);
		Thread.sleep(5000);
		newdriver.close();
	}

}
