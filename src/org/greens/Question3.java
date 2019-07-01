package org.greens;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question3 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\WorkSpace\\Robot\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement ele = driver.findElement(By.xpath("//p[contains(text(),' is a leading Training and Placements company in Chennai')]"));
		
		
	Actions acc= new Actions(driver);
		
	acc.doubleClick(ele).perform();

	acc.contextClick(ele).perform();;
	
	Robot r=new Robot();
	
	for (int i = 0; i <=2; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
				
}
	
}