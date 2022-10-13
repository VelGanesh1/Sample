package SWAGLAB.PROJECT;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SWAGLAB  {
	public static void main(String[]args) throws Throwable {
		Properties prop = new Properties();
		prop.load(new FileInputStream("./Config.properties"));
		String userproperty = prop.getProperty("Username");
		String passproperty = prop.getProperty("Password");
		String urlproperty = prop.getProperty("Url");
		String serchproperty = prop.getProperty("Search");
		System.setProperty("webdriver.chrome.driver", ".\\DriverLocation\\Chromedriver.exe");
		WebDriver Ganesh = new ChromeDriver();
		Ganesh.get(urlproperty);
		Ganesh.manage().window().maximize();
		//Ganesh.findElement(By.xpath("//input[@name='q']")).sendKeys("SWAG LABS");
		Ganesh.findElement(By.xpath("//input[@name='q']")).sendKeys(prop.getProperty("Search"));
				//or
		//Ganesh.findElement(By.xpath("//input[@name='q']")).sendKeys(serchproperty);
		Ganesh.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		Ganesh.findElement(By.xpath("//div/a[@href='https://www.saucedemo.com/']/h3[@class='LC20lb MBeuO DKV0Md']")).click();
		//Ganesh.findElement(By.xpath("//input[@id='user-name']")).sendKeys("performance_glitch_user");
		//Ganesh.findElement(By.xpath("//input[@id='user-name']")).sendKeys(prop.getProperty("Username"));
				//or
		Ganesh.findElement(By.xpath("//input[@id='user-name']")).sendKeys(userproperty);
		//Ganesh.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Ganesh.findElement(By.xpath("//input[@id='password']")).sendKeys(prop.getProperty("Password"));
		Ganesh.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(5000);
		
		//Window Scroll down/up
		//JavascriptExecutor js = (JavascriptExecutor) Ganesh;
		//js.executeScript("window.scrollBy(0.10000)");
		
		
		
		WebElement a = Ganesh.findElement(By.xpath("//div/div[@class='inventory_item_label']/a/div[contains(text(),'Sauce Labs Backpack')]/../../../div[@class='pricebar']/button[contains(text(),'Add to cart')]"));
		
		a.click();
		
		
		Thread.sleep(3000);
		Ganesh.findElement(By.xpath("//*[@class='inventory_item_label']//*[contains(text(),'Sauce Labs Bike Light')]/../../../div[@class='pricebar']/button[contains(text(),'Add to cart')]")).click();
		Thread.sleep(3000);
		WebElement c = Ganesh.findElement(By.xpath("//*[@class='inventory_item_label']//*[starts-with(text(),'Sauce Labs Bo')]/../../../div[@class='pricebar']/button[contains(text(),'Add to cart')]"));
		JavascriptExecutor js = (JavascriptExecutor) Ganesh;
		
		js.executeScript("arguments[0].scrollIntoView(true);", c);
		
		Thread.sleep(5000);
		c.click();
		
		Thread.sleep(3000);
		Ganesh.findElement(By.xpath("//*[@class='inventory_item_label']//*[starts-with(text(),'Sauce Labs Fleece')]/../../../div[@class='pricebar']/button[starts-with(text(),'Add to')]")).click();
		Thread.sleep(3000);
		
		WebElement b =
		Ganesh.findElement(By.xpath("//*[@class='inventory_item_label']//*[starts-with(text(),'Sauce Labs One')]/../../../div[@class='pricebar']/button[starts-with(text(),'Add to')]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", b);
		
		Thread.sleep(5000);
		
		b.click();
		
		Thread.sleep(3000);
		Ganesh.findElement(By.xpath("//*[starts-with(@class,'inventory')]//*[contains(text(),'TheThings()')]/../../../div[@class='pricebar']/button[starts-with(text(),'Add to')]")).click();
		Ganesh.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
		Thread.sleep(5000);
		Ganesh.findElement(By.xpath("//*[@class='cart_item']/div/a/div[contains(text(),'Sauce Labs Bike Light')]/../../div/button[@id='remove-sauce-labs-bike-light']")).click();
		Thread.sleep(3000);
		Ganesh.findElement(By.xpath("//*[starts-with(@class,'cart_item')]//*[starts-with(text(),'Test.allTh')]/../../div/button[contains(text(),'Remove')]")).click();
		Thread.sleep(3000);
		Ganesh.findElement(By.xpath("//*[@id='checkout']")).click();
		Ganesh.findElement(By.xpath("//*[@id='first-name']")).sendKeys("Sankar");
		Ganesh.findElement(By.xpath("//*[@id='last-name']")).sendKeys("Ganesh");
		Ganesh.findElement(By.xpath("//*[@id='postal-code']")).sendKeys("123456");
		Thread.sleep(3000);
		Ganesh.findElement(By.xpath("//*[@id='continue']")).click();
		Thread.sleep(3000);
		Ganesh.findElement(By.xpath("//*[@id='finish']")).click();
		Thread.sleep(3000);
		Ganesh.findElement(By.xpath("//*[@id='back-to-products']")).click();
		Ganesh.findElement(By.xpath("//*[@id='react-burger-menu-btn']")).click();
		Thread.sleep(3000);
		Ganesh.findElement(By.xpath("//*[@id='logout_sidebar_link']")).click();
	}

}
