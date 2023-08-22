//Drop Down
//Select
//isDisplayed

package com.selenium.practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Class3dropDown {
	public static void main(String[]args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		List<WebElement> listOfCountries
		= driver.findElements(By.xpath("//select/option"));
		System.out.println("Ther are "+listOfCountries.size()+" number of Countries");
	for (WebElement i:	listOfCountries) {
		System.out.println(i.getText());
	}
		WebElement dropDown
		=driver.findElement(By.xpath("//select"));
		
		Select fromDropDown = new Select(dropDown);
		fromDropDown.selectByVisibleText("India");
		
		if (dropDown.isDisplayed()) {
			System.out.println("India is selected..." );
		} else {
			System.out.println("Try Again ass...");
		}
		
	}

}
