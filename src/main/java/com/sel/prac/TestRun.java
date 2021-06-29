package com.sel.prac;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRun {
	WebDriver driver;
	@Test
	public void set() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	

}
