package com.dbmi.somaWebd;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SOMA_Education extends Soma_Login{

//	  private boolean acceptNextAlert = true;
	
	@Test
	public void testEducation() throws Exception{
		testSomaLogin();
		studentAccount();
		driver.findElement(By.linkText("My Application")).click();
		Thread.sleep(200);
		//Education
		driver.findElement(By.linkText("Education")).click();
		Thread.sleep(200);
		
		driver.findElement(By.id("edit-university1")).sendKeys(RandomData.getRandomData5());
		driver.findElement(By.id("edit-state1")).sendKeys(RandomData.getRandomData5());
		Thread.sleep(200);
		
		WebElement country1 = driver.findElement(By.id("edit-country1"));
		Select sel = new Select(country1);
		sel.selectByVisibleText(RandomSelectSOMA.getRandomCountry());
		driver.findElement(By.id("edit-city1")).clear();
		driver.findElement(By.id("edit-city1")).sendKeys(RandomData.getRandomData5());
	
		
		driver.findElement(By.id("edit-degree-date1-datepicker-popup-0")).clear();
		driver.findElement(By.id("edit-degree-date1-datepicker-popup-0")).sendKeys(RandomSelectSOMA.getRandomFutureDt());
		Thread.sleep(200);
		
		WebElement degree = driver.findElement(By.id("edit-degree-type-id1"));
		Select seldegree = new Select(degree);
		seldegree.selectByVisibleText(RandomSelectSOMA.getDegreeType());
		
		WebElement major = driver.findElement(By.id("edit-major-id1"));
		Select selmajor = new Select(major);
		selmajor.selectByVisibleText(RandomSelectSOMA.getOptMajor());
		
		driver.findElement(By.id("edit-gpa1")).clear();
		driver.findElement(By.id("edit-gpa1")).sendKeys(RandomData.getRandomData5());
		
		
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(200);
		
		if(gm.isElementPresent("messages", "id"))
		{
			String messages = driver.findElement(By.id("messages")).getText().toString();
			System.out.println("OutPut message:"+messages);	
		}
		else
		{
			System.out.println("check the code");
		}
		
		driver.findElement(By.id("edit-add-more")).click();
		Thread.sleep(200);

		driver.findElement(By.id("edit-university2")).sendKeys(RandomData.getRandomData5());
		driver.findElement(By.id("edit-state2")).sendKeys(RandomData.getRandomData5());
		
		WebElement country2 = driver.findElement(By.id("edit-country2"));
		Select selcountry2 = new Select(country2);
		selcountry2.selectByVisibleText(RandomSelectSOMA.getRandomCountry());
		
		driver.findElement(By.id("edit-city2")).clear();
		driver.findElement(By.id("edit-city2")).sendKeys(RandomData.getRandomData5());
		
		
		driver.findElement(By.id("edit-degree-date2-datepicker-popup-0")).clear();
		driver.findElement(By.id("edit-degree-date2-datepicker-popup-0")).sendKeys(RandomSelectSOMA.getRandomFutureDt());
		Thread.sleep(200);
		
		WebElement degree2 = driver.findElement(By.id("edit-degree-type-id2"));
		Select seldegree2 = new Select(degree2);
		seldegree2.selectByVisibleText(RandomSelectSOMA.getDegreeType());
		
		WebElement major2 = driver.findElement(By.id("edit-major-id2"));
		Select selmajor2 = new Select(major2);
		selmajor2.selectByVisibleText(RandomSelectSOMA.getOptMajor());
		
		driver.findElement(By.id("edit-gpa2")).clear();
		driver.findElement(By.id("edit-gpa2")).sendKeys(RandomData.getRandomData5());
		
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(200);
		
		if(gm.isElementPresent("messages", "id"))
		{
			String messages2 = driver.findElement(By.id("messages")).getText().toString();
			System.out.println("OutPut message:"+messages2);	
		}
		else
		{
			System.out.println("check the code");
		}
	}
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		 driver.quit();
	}
}