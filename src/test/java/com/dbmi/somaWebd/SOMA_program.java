package com.dbmi.somaWebd;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SOMA_program extends Soma_Login{

//	  private boolean acceptNextAlert = true;
	
	@Test
	public void testProgram() throws Exception{
		testSomaLogin();
		studentAccount();
		driver.findElement(By.linkText("My Application")).click();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.id("edit-program-id"));
//		WebElement element = driver.findElement(By.xpath(".//*[contains(@name, 'program')]"));
//		WebElement element = driver.findElement(By.xpath(".//*[@name='program_id']"));
		Select sel = new Select(element);
		
		sel.selectByVisibleText(RandomSelectSOMA.getOptProgram());
		Thread.sleep(200);
		
		WebElement element2 = driver.findElement(By.id("edit-isp"));
		Select sel2 = new Select(element2);
		
		sel2.selectByVisibleText(RandomSelectSOMA.getOptYesNo());
		Thread.sleep(200);
		
		driver.findElement(By.id("edit-interests--2")).sendKeys(RandomData.getRandomData25());
		Thread.sleep(200);

//		Selecting 4 faculties
		driver.findElement(By.id("edit-faculty-"+RandomSelectSOMA.getRandomRadOpt7())).click();
		
		driver.findElement(By.id("edit-faculty-"+RandomSelectSOMA.getRandomRadOpt7())).click();
		driver.findElement(By.id("edit-faculty-"+RandomSelectSOMA.getRandomRadOpt7())).click();
//		driver.findElement(By.id("edit-faculty-"+RandomSelectSOMA.getRandomRadOpt7())).click();
		Thread.sleep(50);
		
		driver.findElement(By.id("edit-source-"+RandomSelectSOMA.getRandomRadOpt9())).click();

		WebElement fundSelect = driver.findElement(By.id("edit-request-funding"));
		Select fund = new Select(fundSelect);
		
		fund.selectByVisibleText(RandomSelectSOMA.getOptYesNo());
		Thread.sleep(200);
		
		driver.findElement(By.id("edit-courses")).sendKeys(RandomData.getRandomData25());
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
	}
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		 driver.quit();
	}
}