package org.webDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivers {

	static String x = "";
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

		List<WebElement> mobiles = w.findElements(By.xpath("(//div[@class='_4rR01T'])"));
		File f = new File(".\\target\\flipkart.xlsx");
		FileOutputStream F = new FileOutputStream(f);
		HSSFWorkbook book = new HSSFWorkbook();
		HSSFSheet Mobiles = book.createSheet("Mobiles");


		for(int i=0;i<mobiles.size();i++) {
			HSSFRow rows = Mobiles.createRow(i);
			HSSFCell cell = rows.createCell(0);
			WebElement mobile = mobiles.get(i);
			String name = mobile.getText();
			cell.setCellValue(name);
		}
		WebElement four = mobiles.get(3);
		four.click();
		String parent = w.getWindowHandle();
		Set<String> children = w.getWindowHandles();
		for (String child : children) {
			if(!child.equals(parent)) {
				w.switchTo().window(child);
				WebElement sub = w.findElement(By.xpath("//span[@class='B_NuCI']"));
				String pagename = sub.getText();
				x=pagename;
				System.out.println(x);
			}
		}

		book.write(f);
		book.close();

		FileInputStream f1 = new FileInputStream(f);
		HSSFWorkbook rbook = new HSSFWorkbook(f1);
		HSSFSheet sheet = rbook.getSheet("Mobiles");
		HSSFRow row = sheet.getRow(3);
		HSSFCell cell = row.getCell(0);
		String value = cell.getStringCellValue();

		if(x.contains(value)) {
			System.out.println(value);
		}

		w.quit();
	}
}
