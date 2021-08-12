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

public class TC_05CheckBoxesTest {

	/**
	 * @param args
	 */
	
//	public static void main(String[] args) {
	
		@Test(priority = 5)

		public void checkBoxesTest() throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://formy-project.herokuapp.com/checkbox");
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("checkbox-1")).click();
		
		driver.findElement(By.id("checkbox-2")).click();
		
//		driver.findElement(By.id("checkbox-3")).click();

		
	}

}