package org.webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//target//chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("http://www.amazon.com");
		
		WebElement searchbar = w.findElement(By.xpath("//input[@type='text']"));
		searchbar.sendKeys("voltas");
		WebElement submit = w.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		WebElement firstelement = w.findElement(By.xpath("(//span[contains(text(),'Samsung')])[1]"));
		firstelement.click();
	}
}
