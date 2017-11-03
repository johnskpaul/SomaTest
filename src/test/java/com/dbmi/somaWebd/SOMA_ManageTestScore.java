package com.dbmi.somaWebd;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SOMA_ManageTestScore extends Soma_Login{

//	  private boolean acceptNextAlert = true;
	
	@Test
	public void testManageTestScore() throws Exception{
		testSomaLogin();
		managerAccount();
				
		driver.findElement(By.linkText("Manage Applications")).click();
		Thread.sleep(2000);
		
//		Sort		
		WebElement sort = driver.findElement(By.id("edit-sortby"));		
		Select sel = new Select(sort);
		sel.selectByVisibleText("Last Name");
		Thread.sleep(2000);
		
		WebElement sort2 = driver.findElement(By.id("edit-sortdirection"));		
		Select sel2 = new Select(sort2);
		sel2.selectByVisibleText("ASC");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("view")).click();
		Thread.sleep(2000);

	    driver.findElement(By.linkText("Other Info")).click();
		Thread.sleep(2000);
					
		driver.findElement(By.linkText("Test Score")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("edit-gre-verbal-score")).sendKeys(RandomNumber.getRandomNumer2());
	    wait30();
		driver.findElement(By.id("edit-gre-verbal-percentage")).sendKeys(RandomNumber.getRandomNumer2());
		wait30();
		
		driver.findElement(By.id("edit-gre-quantitative-score")).sendKeys(RandomNumber.getRandomNumer2());
		wait30();
		driver.findElement(By.id("edit-gre-quantitative-percentage")).sendKeys(RandomNumber.getRandomNumer2());
		wait30();
		
		driver.findElement(By.id("edit-gre-analytical-writing-score")).sendKeys(RandomNumber.getRandomNumer2());
		wait30();
		driver.findElement(By.id("edit-gre-analytical-writing-percentage")).sendKeys(RandomNumber.getRandomNumer2());
		wait30();
		
		driver.findElement(By.id("edit-toefl-score")).sendKeys(RandomNumber.getRandomNumer2());
		wait30();
		
		driver.findElement(By.id("edit-other-test")).sendKeys(RandomData.getRandomData14());
		wait30();
		
		driver.findElement(By.xpath(".//*[contains(@value, 'Save')]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
		
		try {
		      assertTrue(isElementPresent(By.id("messages")));
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }
		String messages2 = driver.findElement(By.id("messages")).getText().toString();
		System.out.println("OutPut message:"+messages2);
	}
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
//		 driver.quit();
	}
}