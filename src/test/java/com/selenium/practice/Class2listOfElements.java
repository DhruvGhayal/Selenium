//listing all hyperlink elements
package com.selenium.practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2listOfElements{
	public static void main(String[]args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
	List <WebElement> Financial = driver.findElements(By.xpath("//ul[@id='hl1']/li/a"));
	List <WebElement> FitnessAndHealth = driver.findElements(By.xpath("//ul[@id='hl2']/li/a"));
	List <WebElement> Math = driver.findElements(By.xpath("//ul[@id='hl3']/li/a"));
	List <WebElement> Other = driver.findElements(By.xpath("//ul[@id='hl5']/li/a"));
	
	
			System.out.println("Number of Financial Calculator "+Financial.size());
			System.out.println("Which are as follows...");
			for (WebElement i:Financial) {
				System.out.println(i.getText());}
			System.out.println("################################");		
			System.out.println("Number of FitnessAndHealth Calculator "+FitnessAndHealth.size());
			System.out.println("Which are as follows...");
			for (WebElement x:FitnessAndHealth) {
				System.out.println(x.getText());}
			System.out.println("################################");		
			System.out.println("Number of Math Calculator "+Math.size());
			System.out.println("Which are as follows...");
			for (WebElement y:Math) {
				System.out.println(y.getText());
				System.out.println("################################");
			System.out.println("Number of Math Calculator "+Other.size());
			System.out.println("Which are as follows...");
			for (WebElement z :Other) {
				System.out.println(z.getText());
			}
		}
	}
}
