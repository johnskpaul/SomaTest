package com.dbmi.somaWebd;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SOMA_Comm_Interview extends Soma_Login{

//	  private boolean acceptNextAlert = true;
	
	@Test
	public void testComm_Interview() throws Exception{
		testSomaLogin();
		ProfAccount();
				
		driver.findElement(By.linkText("Review Applications")).click();
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

	    driver.findElement(By.linkText("Your Interviews")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("view")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("edit-completed-yes")).click();
		wait30();
		
		WebElement recom = driver.findElement(By.id("edit-recommendation"));
		Select recomSel = new Select(recom);
		recomSel.selectByVisibleText(RandomSelectSOMA.getRecomSel());
		
		driver.findElement(By.id("edit-note")).sendKeys(RandomData.getRandomData4000());
		wait30();
		
		driver.findElement(By.id("edit-note")).sendKeys(RandomData.getRandomData1000());
		wait30();
				
//		WebElement facutly = driver.findElement(By.id("edit-faculty"));
//		Select selFac = new Select(facutly);
//		selFac.selectByVisibleText("Gregory Cooper");
//		wait30();
//		
//		driver.findElement(By.id("edit-date-datepicker-popup-0")).sendKeys("2017-12-04");
//		wait30();
//		
//		driver.findElement(By.id("edit-date-timeEntry-popup-1")).sendKeys("11:20 AM");
		
		driver.findElement(By.xpath(".//*[contains(@value, 'Save')]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
//		try {
//		      assertTrue(isElementPresent(By.id("messages")));
//		    } catch (Error e) {
//		      verificationErrors.append(e.toString());
//		    }
//		String messages2 = driver.findElement(By.id("messages")).getText().toString();
//		System.out.println("OutPut message:"+messages2);
	}
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		 driver.quit();
	}
}