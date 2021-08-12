package com.Demo1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.grpc.Context.Key;


/*This scenario is to test the 
login functionality of the application*/


public class TC_02DropDownTest {
	
//	 public static void main(String[] args) throws InterruptedException, Exception {
		 
		 @Test(priority = 2)

			public void dropDownTest() throws InterruptedException, AWTException {

		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
	//	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	//	driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(4000);
		
		String url = driver.getCurrentUrl();
		System.out.println("After successful login URL is: " + url);		
		
		Thread.sleep(4000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		
	    dropdown.click();
		
	    Thread.sleep(4000);
	    
		Select dropdown1 = new Select (driver.findElement(By.xpath("//select[@class='product_sort_container']")));
			
//		dropdown1.selectByIndex(0);
//		dropdown1.selectByIndex(1);
//		dropdown1.selectByIndex(2);
//		dropdown1.selectByIndex(3);
		

		
		dropdown1.selectByVisibleText("Name (Z to A)");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);

// Assignment 
		
//		driver.quit();
		
//		driver.findElement(By.xpath("//select[@class='product_sort_container']")).sendKeys(Keys.RETURN);
		
		/*
		 * driver.close();
		 * 
		 * driver.quit();
		 */
		
	}


}
	

