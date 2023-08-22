//radio button
//isSelected
package com.selenium.practice;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class4radioButton {
	public static void main (String[]args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.globalsqa.com/samplepagetest/");
		List<WebElement> listOfQualification
		= driver.findElements(By.cssSelector("input.radio"));
		System.out.println("Number Of Qualification "+listOfQualification.size());
		
		for (WebElement i:listOfQualification) {
			System.out.println(i.getAttribute("value")+"-------"+i.isSelected());
		}
		listOfQualification.get(1).click();
		for (WebElement i:listOfQualification) {
			if(i.isSelected())
			System.out.println(i.getAttribute("value")+"-------"+i.isSelected());
		}
	}

}
