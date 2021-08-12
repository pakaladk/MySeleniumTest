/**
 * 
 */
package com.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Phalguna
 *
 */

public class TC_04UploadTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	
//	public static void main(String[] args) throws InterruptedException {
	
	@Test(priority = 4)

	public void uploadTest() throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Jaffar");

		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();

		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Shaik");

		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("JaffarS Test");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jaffar.shaik706@gmail.com");

		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("0878789698");

		driver.findElement(By.name("radiooptions")).click();

		driver.findElement(By.id("checkbox1")).click();

		Select skills = new Select(driver.findElement(By.id("Skills")));

		skills.selectByVisibleText("C++");

		Select countries = new Select(driver.findElement(By.id("countries")));
		
		countries.selectByVisibleText("South Africa");

		Select dateBirth = new Select(driver.findElement(By.id("yearbox")));

		dateBirth.selectByVisibleText("1978");

		Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));

		month.selectByVisibleText("September");

		Select day = new Select(driver.findElement(By.id("daybox")));

		day.selectByIndex(3);

		driver.findElement(By.id("firstpassword")).sendKeys("Test123");

		driver.findElement(By.id("secondpassword")).sendKeys("Test123");
		
		Thread.sleep(5000);

		WebElement upload = driver.findElement(By.id("imagesrc"));

		upload.sendKeys("C:\\Users\\Dell Precision 3541\\Desktop\\Test Automation\\eGiftCardError.png");





		

	}

}
