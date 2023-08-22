//iFrame
//switchTo
//Action calss for drag and drop

package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class6iFramePlusDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		System.out.println("After switching frame.....");
		//driver.switchTo().frame(driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]/iframe[1]")));
		List<WebElement> dragableImg
		= driver.findElements(By.xpath("//ul/li/img"));
		
		if (dragableImg.size()>0) {
			System.out.println("We are in iframe....");
		}else {
			System.out.println("Try again ass...");
		}
		System.out.println("After switching frame.....");
		driver.switchTo().frame(driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]/iframe[1]")));
		List<WebElement> dragableImg2
		= driver.findElements(By.xpath("//ul/li/img"));
		
		if (dragableImg2.size()>0) {
			System.out.println("We are in iframe....");
		}else {
			System.out.println("Try again ass...");
		}
		
		System.out.println("Lets move images to trash...");
		WebElement img1 = driver.findElement(By.xpath("//li/h5[text()='High Tatras']"));
		WebElement img2 = driver.findElement(By.xpath("//li/h5[text()='High Tatras 2']"));
		WebElement img3 = driver.findElement(By.xpath("//h5[contains(text(),'High Tatras 3')]"));
		WebElement img4 = driver.findElement(By.xpath("//h5[contains(text(),'High Tatras 4')]"));
		WebElement trash = driver.findElement(By.id("trash"));
		Actions builder = new Actions (driver);
		builder.dragAndDrop(img1, trash).build().perform();
		builder.dragAndDrop(img2, trash).build().perform();
		builder.dragAndDrop(img3, trash).build().perform();
		builder.dragAndDrop(img4, trash).build().perform();
		//driver.quit();
		driver.switchTo().defaultContent();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
	
	}
}
