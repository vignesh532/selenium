package org.greens;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question13 {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\WorkSpace\\Robot\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement cli = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		cli.click();
		
			WebElement sam = driver.findElement(By.xpath("//div[text()='Samsung A50']"));
		
		
		
		Actions acc= new Actions(driver);
		acc.contextClick(sam).perform();;
		
        Robot r=new Robot();
		
		for (int i = 0; i<=1; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

}
	
}
