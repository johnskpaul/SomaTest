package com.dbmi.somaWebd;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SOMA_ManageAdditionalDocs extends Soma_Login{

//	  private boolean acceptNextAlert = true;
	
	@Test
	public void testManageAdditionalDocs() throws Exception{
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
					
		driver.findElement(By.linkText("Additional Documents")).click();
		Thread.sleep(2000);

		// Scroll down
		js.executeScript("window.scrollBy(0, 1900);");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("edit-add-doc"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -190);");
		
		driver.findElement(By.id("edit-add-doc")).click();
		Thread.sleep(2000);

		// Scroll down
		js.executeScript("window.scrollBy(0, 1900);");
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.id("edit-file3"));
		js.executeScript("arguments[0].scrollIntoView(true);", element2);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -190);");
		
	    driver.findElement(By.id("edit-file3")).clear();
	    driver.findElement(By.id("edit-file3")).sendKeys("C:\\Users\\JOP55\\Documents\\ACT\\ACT queries for database optimization.docx");

	    WebElement docType = driver.findElement(By.id("edit-type3"));
	    Select docSel = new Select(docType);
	    docSel.selectByVisibleText(RandomSelectSOMA.getOptTypDoc());
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("edit-description3")).sendKeys(RandomData.getRandomData1000());
	    
		driver.findElement(By.xpath(".//*[contains(@value, 'Save')]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		try {
		      assertTrue(isElementPresent(By.id("messages")));
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }
		String messages3 = driver.findElement(By.id("messages")).getText().toString();
		System.out.println("OutPut message:"+messages3);
	}
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		 driver.quit();
	}
}