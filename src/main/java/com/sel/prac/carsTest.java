package com.sel.prac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class carsTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.cargurus.com/");
		}
	
	@Test(priority=1,enabled=false)
	public void verifyPageTitle() {
		String actualTitle = driver.getTitle();
		String expectedTitle="Used Cars, New Cars, Reviews, Photos and Opinions - CarGurus";
		System.out.println(actualTitle);
		System.out.println(expectedTitle);
		
		Assert.assertEquals(actualTitle,expectedTitle);
	}
	
	@Test(priority=2,enabled=true)
	public void CPOByZipCode() {
		
		
		//	Actions act = new Actions(driver);
		//WebElement usedCar =	driver.findElement(By.xpath(//label[@class="ft-homepage-search__tabs__used-car"]));
		//act.moveToElement(usedCar).moveToElement(//label[@class="ft-homepage-search__tabs__new-car"])
		
		//WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement CPO = driver.findElement(By.id("heroSearch-tab-content-2"));
		//wait.until(ExpectedConditions.elementToBeClickable(CPO));
		//CPO.click();
	
		driver.findElement(By.id("dealFinderZipCPOId")).sendKeys("75007");
		driver.findElement(By.id("dealFinderFormCPO_0")).sendKeys(Keys.ENTER);
	
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains("Carrollton"));
	
	}
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
}
