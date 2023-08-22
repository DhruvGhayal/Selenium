package com.selenium.practice;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class Class11NewTabAndMultipleTabHandling {
	public static void main (String[]args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		System.out.println("We are on "+driver.getTitle()+" HomePage");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		System.out.println("Now we are on "+driver.getTitle()+" HomePage");
		Set<String> allWindows = driver.getWindowHandles();
		List <String> allHandles = new ArrayList<String>();
		allHandles.addAll(allWindows);
		System.out.println("Total number of tabs open = " + allHandles.size());
		driver.switchTo().window(allHandles.get(0));
		System.out.println("This is switching of Tabs, which bring us to " + driver.getTitle()+" again..");
		Thread.sleep(5000);
		driver.switchTo().window(allHandles.get(1));
		System.out.println("This is switching of Tabs, which bring us to " + driver.getTitle()+" again..");
	}
}
