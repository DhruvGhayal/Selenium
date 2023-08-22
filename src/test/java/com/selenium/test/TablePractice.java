package com.selenium.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TablePractice {
	public static void main(String[]args) throws InterruptedException {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//span[text()='PIM']")).click();
	List<WebElement> numberOfRows = driver.findElements(By.xpath("//div[@class='oxd-table-body']/div"));
	List<WebElement> numberOfColumns = driver.findElements(By.xpath("//div[@class='oxd-table-body']/div[1]/div/div"));
	//System.out.println(" id  |  FirstName | LastNme | JobTitle |");
	int i;
	int j;
	for(i=1; i<=numberOfRows.size(); i++) {
		for(j= 2; j<numberOfColumns.size(); j++) {
			System.out.println(driver.findElement(By.xpath("//div[@class='oxd-table-body']/div["+i+"]/div/div["+j+"]")).getText()+"|");
			System.out.println(" ");
		}
	}
	}
}
