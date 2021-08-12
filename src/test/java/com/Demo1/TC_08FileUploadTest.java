/**
 * 
 */
package com.Demo1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

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

public class TC_08FileUploadTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws AWTException 
	 */
	
//	public static void main(String[] args) throws InterruptedException, AWTException {
	
	@Test(priority = 8)

	public void fileUploadTest() throws InterruptedException, AWTException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://formy-project.herokuapp.com/fileupload");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//button[normalize-space()='Choose']")).click();
		
		String fileAbsolutePath = "C:\\Users\\Dell Precision 3541\\Desktop\\Test Automation\\Phalguna.pdf";

		StringSelection copyClipBoard = new StringSelection(fileAbsolutePath);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copyClipBoard, null);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Robot rb = new Robot();

		rb.keyPress(KeyEvent.VK_CONTROL);

		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);

		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);

		rb.keyPress(KeyEvent.VK_ENTER);

//		driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-choose']"));
		
//		upload.sendKeys("C:\\Users\\Dell Precision 3541\\Desktop\\Test Automation\\eGiftCardError.png");
			
//		System.out.println("Test Passed successfully");
		
	}

}
