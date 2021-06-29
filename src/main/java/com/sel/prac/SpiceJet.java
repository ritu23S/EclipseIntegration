package com.sel.prac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {
	
	WebDriver driver;
	
	@BeforeTest
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to("https://www.spicejet.com/");
	}
	
	@Test
	public void depSelect() {
	//WebElement dep = driver.findElement(By.xpath("//select[@id=\"ctl00_mainContent_ddl_originStation1\"]"));
	//dep.click();
	//Select selectDep = new Select(driver.findElement(By.xpath("//select[@id=\"ctl00_mainContent_ddl_originStation1\"]")));
	
	//selectDep.selectByVisibleText("Ahmedabad");
		//WebElement dep = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
		//dep.click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Ahmedabad");
			
	
 driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Goa");
	
	
String text=	driver.getTitle();
System.out.println(text);

//driver.findElement(By.cssSelector("[href=Default.aspx]")).getText();
	
	}
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

	

}
