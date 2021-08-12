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

public class TC_07RadioButtonsTest {

	/**
	 * @param args
	 */
	
//	public static void main(String[] args) {
	
	@Test(priority = 7)

	public void radioButtonsTest() throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://formy-project.herokuapp.com/radiobutton");
		driver.manage().window().maximize();
		

//		driver.findElement(By.cssSelector("#radio-button-1")).click();
		
		boolean button = driver.findElement(By.cssSelector("#radio-button-1")).isSelected(); 
		
		System.out.println(button);
		
	}

}