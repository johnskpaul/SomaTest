package com.dbmi.somaWebd;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SOMA_ManageInterview extends Soma_Login{

//	  private boolean acceptNextAlert = true;
	
	@Test
	public void testManageInterview() throws Exception{
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

	    driver.findElement(By.linkText("Interview")).click();
		Thread.sleep(2000);
		
//		WebElement facutly = driver.findElement(By.xpath(".//*[contains(@id, 'edit')]"));
		WebElement facutly = driver.findElement(By.id("edit-faculty"));
		Select selFac = new Select(facutly);
		selFac.selectByVisibleText("Gregory Cooper");
		wait30();
		
		driver.findElement(By.id("edit-date-datepicker-popup-0")).sendKeys("2017-12-04");
		wait30();
		
		driver.findElement(By.id("edit-date-timeEntry-popup-1")).sendKeys("11:20 AM");
		
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
		 driver.quit();
	}
}