package com.selenium.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
	public static void main (String[]args) throws AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/UploadImage/");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@type='file']"));
		Actions now = new Actions(driver);
		now.moveToElement(chooseFile).click().perform();
		Robot rb = new Robot();
		StringSelection ss = new StringSelection("D:\\New folder (2)\\Disha Patani\\mcgu3d0758xa1.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
	}

}
