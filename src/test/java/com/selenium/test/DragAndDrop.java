package com.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Propagation");
		//System.out.println((driver.findElements(By.tagName("iframe")).size()));
		WebElement iframe = driver.findElement(By.xpath("//div[@rel-title='Propagation']/p/iframe")); 
		driver.switchTo().frame(iframe);
		/*List<WebElement> dragable
		= driver.findElements(By.id("draggable"));
		if(dragable.size()>0) {
			System.out.println("We are in required frame...");
		}else {
			System.out.println("Check next iframe...");
		}*/
		WebElement dragable = driver.findElement(By.id("draggable"));
		WebElement outerDropable1 = driver.findElement(By.id("droppable"));
		WebElement outerDropable2 = driver.findElement(By.id("droppable2"));
		WebElement innerDropable1 = driver.findElement(By.id("droppable-inner"));
		WebElement innerDropable2 = driver.findElement(By.id("droppable2-inner"));
		Actions builder = new Actions (driver);
		builder.dragAndDrop(dragable, outerDropable1).build().perform();
		if(outerDropable1.getText().contains("Dropped!")) {
		System.out.println("Item is droped in 1st outter dropable");
		}else {
			System.out.println("Not here....");
		}
		System.out.println("################################");
		builder.dragAndDrop(dragable, outerDropable2).build().perform();
		if(outerDropable2.getText().contains("Dropped!")) {
		System.out.println("Item is droped in 2nd outter dropable");
		}else {
			System.out.println("Not here....");
		}
		System.out.println("################################");
		builder.dragAndDrop(dragable, innerDropable1).build().perform();
		if(outerDropable2.getText().contains("Dropped!")) {
		System.out.println("Item is droped in not greedy inner dropable");
		}else {
			System.out.println("Not here....");
		}
		System.out.println("################################");
		builder.dragAndDrop(dragable, innerDropable2).build().perform();
		if(outerDropable2.getText().contains("Dropped!")) {
		System.out.println("Item is droped in greedy inner dropable");
		}else {
			System.out.println("Not here....");
		}
	}}
