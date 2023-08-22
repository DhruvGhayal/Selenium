package com.selenium.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	public static void main (String[]args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allHandles = new ArrayList<String>();
		allHandles.addAll(allWindows);
		System.out.println(allHandles.size());
		driver.switchTo().window(allHandles.get(0));
		System.out.println(driver.getTitle());
		driver.switchTo().window(allHandles.get(1));
		System.out.println(driver.getTitle());
	}

}
