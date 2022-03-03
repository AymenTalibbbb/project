package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	public class Login {
 public static void main(String[] args) {
	 login_Test();
 }
 @Test
	    	public static void login_Test()
	    	{
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\talibaym\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.saucedemo.com/");
	        //find and set username
	        WebElement usernameField = driver.findElement(By.id("user-name"));
	        usernameField.sendKeys("standard_user");
	        //find and set password
	        WebElement passwordField = driver.findElement(By.id("password"));
	        passwordField.sendKeys("secret_sauce");
	        //click on login button
	        driver.findElement(By.id("login-button")).click();
	    }
 }


