package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class9DynamicTable {
	public static void main(String[]args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/webtables");
		List<WebElement> numberOfRows
		= driver.findElements(By.xpath("//div[@class='rt-tr -odd' or @class='rt-tr -even']"));
		System.out.println("Total Number of Rows are "+numberOfRows.size());
		
		List<WebElement> numberOfColumns
		= driver.findElements(By.xpath("//div[@class='rt-tr']/div"));
		System.out.println("Total Number of Columns are "+numberOfColumns.size());
		int i;
		int j;
		
		for(i=1; i<=numberOfRows.size(); i++) {
			for(j=1; j<=numberOfColumns.size(); j++)
			System.out.print((driver.findElement(By.xpath("//div[@class='rt-table']/div[2]/div["+i+"]/div/div["+j+"]")).getText())+"  |  ");
			System.out.println("  ");
			}}}

