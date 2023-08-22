//iframe size 
//how to switch between iframes

package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5iFrames {
	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://chercher.tech/practice/frames-example-selenium-webdriver");
	driver.manage().window().maximize();
	List<WebElement> numberOfIframe
	= driver.findElements(By.tagName("iframe"));
	System.out.println("Number of iframes "+numberOfIframe.size());
	driver.switchTo().frame(0);
	List<WebElement> parent1
	= driver.findElements(By.id("topic"));
	if(parent1.size()>0) {
		System.out.println("We are in Parent Frame 1...");
	}else {
		System.out.println("Try again you ass....");
	}
	driver.switchTo().frame(driver.findElement(By.id("frame3")));
	List<WebElement> innerIframe
	= driver.findElements(By.xpath("//body/b[contains(text(),'Inner Frame Check box :')]"));
	if(innerIframe.size()>0) {
		System.out.println("We are in childFrame of parentFrame 1...");
	}else {
		System.out.println("Try again you ass....");
	}
	System.out.println("Now we are on the ParentFrame 1 again....");
	}
}
