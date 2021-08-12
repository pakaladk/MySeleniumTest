/**
 * 
 */
package com.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Phalguna
 *
 */

public class TC_03ButtonsTest {

//	public static void main(String[] args) throws InterruptedException {
	
	@Test(priority = 3)

	public void buttonsTest() throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://formy-project.herokuapp.com/buttons");
		driver.manage().window().maximize();

//		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary']")).click();

//		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-success']")).click();

//		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-info']")).click();

//		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-warning']")).click();

//		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-danger']")).click();

//		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-link']")).click();

		
		/*
		 * WebElement we =
		 * driver.findElement(By.xpath("//button[contains(string(),'Left')]")); Actions
		 * clickTriangle= new Actions(driver);
		 * clickTriangle.moveToElement(we).moveByOffset(-10, -5).click().perform();
		 */

		/*
		 * WebElement we =
		 * driver.findElement(By.xpath("//button[contains(string(),'Middle')]"));
		 * Actions clickTriangle= new Actions(driver);
		 * clickTriangle.moveToElement(we).moveByOffset(-10, -5).click().perform();
		 */

		/*
		 * WebElement we =
		 * driver.findElement(By.xpath("//button[contains(string(),'Right')]")); Actions
		 * clickTriangle= new Actions(driver);
		 * clickTriangle.moveToElement(we).moveByOffset(-10, -5).click().perform();
		 */
		 
//		driver.findElement(By.xpath("(//*[@class='btn btn-lg btn-primary'])[5]")).click();
//		driver.findElement(By.xpath("//*[text()='1']")).click();
				
//		driver.findElement(By.xpath("(//*[@class='btn btn-lg btn-primary'])[6]")).click();
//		driver.findElement(By.xpath("//*[text()='2']")).click();
		
		driver.findElement(By.id("btnGroupDrop1")).click();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("(//*[@class = 'dropdown-item'])[15]")).click();
//		driver.findElement(By.xpath("//*[text()='Dropdown link 1']")).click();
//		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("(//*[@class = 'dropdown-item'])[16]")).click();
		driver.findElement(By.xpath("//*[text()='Dropdown link 2']")).click();
		Thread.sleep(2000);
		
		System.out.println("Test Passed successfully");

	}

	// TODO Auto-generated method stub

}

// TODO Auto-generated method stub
