//3 types of alerts: simple, confirmation, prompt 
package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8Alerts {
	public static void main(String[]args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		//1a. Simple Alert
		driver.findElement(By.id("alertButton")).click();
		//Thread.sleep(5000);
		driver.switchTo().alert().accept();
		//1b. Simple Alert with wait
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
		//2. Confirmation alert
		System.out.println("Following option was selected for confirmation alert...");
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(10000);
		driver.switchTo().alert().dismiss();
		WebElement result 
		= driver.findElement(By.id("confirmResult"));
		if (result.getText().contains("Cancel")) {
			System.out.println("You selected Cancel...");
		} else {
			System.out.println("You selected OK....");
		}
		//3. Prompt alert
				System.out.println("Moving to Prompt alert...");
				driver.findElement(By.id("promtButton")).click();
				Thread.sleep(5000);
				String x = "dumb-fuck";
				driver.switchTo().alert().sendKeys(x);
				driver.switchTo().alert().accept();
				WebElement promptInput 
				= driver.findElement(By.id("promptResult"));
				
				if (promptInput.getText().contains(x)) {
					System.out.println("Your input is accepted...");
				} else {
					System.out.println("Try again dumbass....");
				}
	}
}
