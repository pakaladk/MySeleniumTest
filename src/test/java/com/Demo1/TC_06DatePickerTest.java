/**
 * 
 */
package com.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Phalguna
 *
 */

public class TC_06DatePickerTest {

	/**
	 * @param args
	 */
	
//	public static void main(String[] args) {
		
		@Test(priority = 6)

		public void datePickerTest() throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://formy-project.herokuapp.com/datepicker");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//*[text()='21']")).click();
		

	}

}