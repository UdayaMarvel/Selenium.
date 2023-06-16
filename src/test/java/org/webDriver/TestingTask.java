package org.webDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingTask {

	
		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver", ".\\target\\chromedriver.exe");
			WebDriver w = new ChromeDriver();
			w.get("http://www.flipkart.com");

			w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


			w.manage().window().maximize();


			WebElement close = w.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			close.click();

			WebElement search = w.findElement(By.name("q"));
			search.sendKeys("mobiles");

			WebElement searchicon = w.findElement(By.xpath("//button[@class='L0Z3Pu']"));
			searchicon.click();
	}
}
