package com.selenium.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class10ScreenShot {
	public static void main (String[]args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.12.0");
		TakesScreenshot cam = ((TakesScreenshot)driver);
		File scr = cam.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\QA\\SeleniumWorkSpace\\interview.selenium.practice\\ScreenShot\\fullPage.png");
		FileUtils.copyFile(scr,dest);
	}
}
