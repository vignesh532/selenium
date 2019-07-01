package org.greens;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\WorkSpace\\Robot\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/webhp");
		
		WebElement tex=driver.findElement(By.xpath("//a[@title='Google apps']"));
		tex.click();
		
		WebElement tex1=driver.findElement(By.xpath("//span[@style='background-position:0 -1725px']"));
		tex1.click();


}
	
}
