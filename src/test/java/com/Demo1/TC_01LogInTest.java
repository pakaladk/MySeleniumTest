package com.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass1;

import io.github.bonigarcia.wdm.WebDriverManager;

/*This scenario is to test the 
login functionality of the application*/

public class TC_01LogInTest extends BaseClass1 {
	
//	 public static void main(String[] args) throws InterruptedException {
	
	@Test(priority = 1)

	public void loginTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

//		WebDriverManager.chromedriver().setup();	
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
//		
//	//	driver.findElement(By.id("user-name")).sendKeys("standard_user");
//	//	driver.findElement(By.name("user-name")).sendKeys("standard_user");
//		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(10000);
		
		String url = driver.getCurrentUrl();
		System.out.println("After successful login URL is: " + url);		
		
		Thread.sleep(4000);
		
//		driver.quit();
				
		/*
		 * driver.close();
		 * 
		 * driver.quit();
		 */
			}
	
}
