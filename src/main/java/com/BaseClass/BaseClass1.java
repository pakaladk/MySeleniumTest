package com.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	
	public ChromeDriver driver;

	@BeforeMethod

	public void beforeMethod() throws InterruptedException {

		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
				
	//	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	//	driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
//		String url = driver.getCurrentUrl();
		Thread.sleep(10000);
		
	}
	
	
		@AfterMethod
	public void tearDown() {

//		if (driver != null)

			driver.quit();

		Reporter.log("=====Browser Session End=====", true);
		
    }
		
}
