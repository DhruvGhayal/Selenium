package com.selenium.practice;
import org.openqa.selenium.chrome.ChromeDriver;
public class Class1{
	public static void main(String[]args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		System.out.println("PAGE TITLE ===>"+driver.getTitle());
		System.out.println("CURRENT URL ===>"+driver.getCurrentUrl());
		System.out.println("PAGE SOURCE ===>"+driver.getPageSource());
	}
}