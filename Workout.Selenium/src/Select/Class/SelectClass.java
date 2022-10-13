package Select.Class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static void main(String[]args) throws Throwable, IOException {
		Properties HTC = new Properties();
		HTC.load(new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Workout.Selenium\\src\\Select\\Class\\HTC.properties"));
		String URL = HTC.getProperty("URL");
		String UserName = HTC.getProperty("UserName");
		String Password = HTC.getProperty("Password");
		String Payslippwd = HTC.getProperty("Paysleap");
		System.setProperty("webdriver.chrome.driver", ".\\DriverLocation\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.manage().window().maximize();
		a.get(URL);
		a.findElement(By.xpath("//input[@id='userNameInput']")).sendKeys(UserName);
		a.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys(Password);
		a.findElement(By.xpath("//button[@id='submitButton']")).click();
		a.findElement(By.xpath("//a[@class='emp-login-btn']")).click();
		Thread.sleep(3000);
		a.findElement(By.xpath("//button[@name='Continue']")).click();
		Thread.sleep(5000);
		a.findElement(By.xpath("//*[@id=\"icon-id\"]")).click();
		Thread.sleep(2000);
		a.findElement(By.xpath("//li/a/span[contains(text(),'Payroll')]")).click();
		Thread.sleep(5000);
		a.findElement(By.xpath("//li/a/span[contains(text(),'Payroll')]/../../ul/li/a[contains(text(),'View Pay Slip')]")).click();
		Thread.sleep(3000);
		a.findElement(By.xpath("//input[@class='form-control']")).sendKeys(Payslippwd);
		a.findElement(By.xpath("//button[@name='subBtn']")).click();
		Thread.sleep(3000);
		WebElement vel = a.findElement(By.xpath("//select[@class='form-control']"));
		Select c = new Select(vel);
		c.selectByVisibleText("Aug-2022");
		Thread.sleep(3000);
		c.selectByIndex(1);
		a.findElement(By.xpath("//button[contains(text(),'Mail')]")).click();
		Thread.sleep(3000);
		a.findElement(By.xpath("//li/a/span[contains(text(),'Home')]")).click();
		Thread.sleep(3000);
		a.findElement(By.xpath("//*[span[contains(text(),'Log out')]]")).click();
		}

}
