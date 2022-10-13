package xpath.find.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathfindattributes {
	public static void main (String []args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\DriverLocation\\chromedriver.exe");
		WebDriver Sankar = new ChromeDriver();
		Sankar.get("https://www.google.com/");
		Sankar.manage().window().maximize();
		Sankar.findElement(By.name("q")).sendKeys("Amazon Login" + Keys.ENTER);
		Sankar.findElement(By.xpath("//a[@href='https://www.amazon.in/your-account']")).click();
		Sankar.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		Sankar.findElement(By.id("ap_email")).sendKeys("8144637828");
		Sankar.findElement(By.xpath("//input[@id='continue']")).click();
		Sankar.findElement(By.name("password")).sendKeys("Mvss@6877");
		Sankar.findElement(By.id("signInSubmit")).click();
		//Sankar.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		//Sankar.findElement(By.linkText("New Releases")).click();
		//Sankar.findElement(By.xpath("//div[@id='B09WQYFLRX']")).click();
		//JavascriptExecutor js = (JavascriptExecutor) Sankar;
		//js.executeScript(null, args);
		Thread.sleep(4000);
		//WebElement searchbox = Sankar.findElement(By.id("twotabsearchtextbox"));
		//searchbox.click();
		//searchbox.sendKeys("Apple 14 pro");
		Sankar.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple 13 pro");
		Thread.sleep(3000);
		Sankar.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Sankar.findElement(By.xpath("//span[contains(text(),'Apple iPhone 13 Pro (128GB) - Gold')]")).click();
		Thread.sleep(5000);
		//Sankar.findElement(By.xpath("//img[@alt='Graphite']")).click();
		Sankar.findElement(By.xpath("//div[@class='a-column a-span6 accordion-caption']/span[contains(text(),'Buy new:')]")).click();
		Sankar.findElement(By.id("add-to-cart-button")).click();
		
			
	}

}
