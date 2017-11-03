package com.dbmi.somaWebd;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SOMA_Documents extends Soma_Login{

//	  private boolean acceptNextAlert = true;
	
	@Test
	public void testEmployment() throws Exception{
		testSomaLogin();
		studentAccount();
		driver.findElement(By.linkText("My Application")).click();
		Thread.sleep(200);
		//Employment
		driver.findElement(By.linkText("Documents")).click();
		Thread.sleep(200);
		
	    driver.findElement(By.id("edit-personal-statement-fid")).clear();
	    driver.findElement(By.id("edit-personal-statement-fid")).sendKeys("C:\\Users\\JOP55\\Documents\\ACT\\MicheleRequest\\AnalyzeCareRequests.docx");
	    driver.findElement(By.id("edit-file1")).clear();
	    driver.findElement(By.id("edit-file1")).sendKeys("C:\\Users\\JOP55\\Documents\\ACT\\MicheleRequest\\AnalyzeCareRequests.docx");

	    WebElement docType = driver.findElement(By.id("edit-type1"));
	    Select seldoc = new Select(docType);
	    seldoc.selectByVisibleText(RandomSelectSOMA.getOptTypDoc());
	    
	    driver.findElement(By.id("edit-description1")).clear();
	    driver.findElement(By.id("edit-description1")).sendKeys(RandomData.getRandomData1000());
	    Thread.sleep(200);
	    
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
		
		driver.findElement(By.id("edit-add-doc")).click();
		Thread.sleep(200);
		
		driver.findElement(By.id("edit-file2")).clear();
	    driver.findElement(By.id("edit-file2")).sendKeys("C:\\Users\\JOP55\\Documents\\ACT\\MicheleRequest\\AnalyzeCareRequests.docx");

	    WebElement docType2 = driver.findElement(By.id("edit-type1"));
	    Select seldoc2 = new Select(docType2);
	    seldoc2.selectByVisibleText(RandomSelectSOMA.getOptTypDoc());
	    
	    driver.findElement(By.id("edit-description2")).clear();
	    driver.findElement(By.id("edit-description2")).sendKeys(RandomData.getRandomData1000());
	    Thread.sleep(200);
	    
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