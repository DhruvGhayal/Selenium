package com.selenium.practice;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class Class12WaitTimes {
	public static void main (String[]args) {
		

			//Launch chrome browser
	
			ChromeDriver driver = new ChromeDriver();
			
			//maximise browser
			driver.manage().window().maximize();
			
		/////IMPLICIT WAIT
			
			//open url
			driver.get("http://www.ebay.in/");
			
			//wait of 10 seconds
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Stopwatch watch = null;
			
			try {
				watch = Stopwatch.createStarted();
			//find webelement "START SELLING"
			driver.findElement(By.linkText("START SELLING")).click();
			}
			catch(Exception e)
			{
				watch.stop();
				System.out.println(e);
				System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds");
			}
			
			
			/////EXPLICIT WAIT
		
	driver.switchTo().newWindow(WindowType.WINDOW);
	
	driver.get("http://www.ebay.in/");

	//explicit wait of 10 seconds
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	
	try {
		watch = Stopwatch.createStarted();
		//find webelement "START SELLING"
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("xyz")));
		element.click();
		//driver.findElement(By.linkText("START SELLING")).click();
	}
	catch(Exception e)
	{
		watch.stop();
		System.out.println(e);
		System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds");
	}
	
	//FLUENT WAIT
	
	driver.switchTo().newWindow(WindowType.WINDOW);
	
	driver.get("http://www.ebay.in/");
	
	Wait <WebDriver> waitF = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(2))
			.withMessage("This is custom message.")
			.ignoring(NoSuchElementException.class);
	
	WebElement element = waitF.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
	element.click();
}

}
		
	


