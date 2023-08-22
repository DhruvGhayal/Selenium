package com.selenium.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class7UploadFileRobotClass {
	public static void main (String[]args) throws AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		//Send Keys method
		/*driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\ghaya\\Desktop\\BUILD3SQLEXPRESS.txt");*/
		WebElement chooseFile = driver.findElement(By.id("uploadFile"));
		Actions builder = new Actions(driver);
		builder.moveToElement(chooseFile).click().perform();
		//robot method
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\ghaya\\Desktop\\BUILD3SQLEXPRESS.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
	}
}
