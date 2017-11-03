package com.dbmi.somaWebd;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SOMA_Recommenders extends Soma_Login{
	
	@Test
	public void testRecommenders() throws Exception{
		testSomaLogin();
		studentAccount();
		driver.findElement(By.linkText("My Application")).click();
		Thread.sleep(200);
		driver.findElement(By.linkText("Recommenders")).click();
		Thread.sleep(200);
		boolean result = gm.isElementPresent("edit-add-name","id");
//		System.out.println("Is Element Present: "+ result);
		Reporter.log("Is Element Present: "+ result);
		
		if (gm.isElementPresent("edit-add-name","id"))
		{
		driver.findElement(By.id("edit-add-name")).click();
		Thread.sleep(200);
		}
		driver.findElement(By.id("edit-fname")).sendKeys(RandomData.getRandomData25());
		driver.findElement(By.id("edit-lname")).sendKeys(RandomData.getRandomData25());
		driver.findElement(By.id("edit-email")).sendKeys("johnskpaul+test1@gmail.com");
		driver.findElement(By.id("edit-waive-right-"+RandomSelectSOMA.getOptyesno())).click();

		driver.findElement(By.id("edit-email-message")).sendKeys(RandomData.getRandomData1000());
		Thread.sleep(200);
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(200);
		
		if(gm.isElementPresent("messages", "id"))
		{
			String messages2 = driver.findElement(By.id("messages")).getText().toString();
//			System.out.println("OutPut message:"+messages2);
			Reporter.log("OutPut message:"+messages2);
		}
		else
		{
			Reporter.log("check the code");
		}
		
		if (gm.isElementPresent("edit-add-name","id"))
		{
		driver.findElement(By.id("edit-add-name")).click();
		Thread.sleep(200);
		}
		
		driver.findElement(By.id("edit-fname")).sendKeys(RandomData.getRandomData25());
		driver.findElement(By.id("edit-lname")).sendKeys(RandomData.getRandomData25());
		driver.findElement(By.id("edit-email")).sendKeys("johnskpaul+test2@gmail.com");
		driver.findElement(By.id("edit-waive-right-"+RandomSelectSOMA.getOptyesno())).click();

		driver.findElement(By.id("edit-email-message")).sendKeys(RandomData.getRandomData1000());
		Thread.sleep(200);
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(200);
		
		if(gm.isElementPresent("messages", "id"))
		{
			String messages3 = driver.findElement(By.id("messages")).getText().toString();
			System.out.println("OutPut message:"+messages3);
			Reporter.log("OutPut message:"+messages3);
		}
		else
		{
			Reporter.log("check the code");
		}
		
		
		if (gm.isElementPresent("edit-add-name","id"))
		{
		driver.findElement(By.id("edit-add-name")).click();
		Thread.sleep(200);
		}
		
		driver.findElement(By.id("edit-fname")).sendKeys(RandomData.getRandomData25());
		driver.findElement(By.id("edit-lname")).sendKeys(RandomData.getRandomData25());
		driver.findElement(By.id("edit-email")).sendKeys("johnskpaul+test3@gmail.com");
		driver.findElement(By.id("edit-waive-right-"+RandomSelectSOMA.getOptyesno())).click();

		driver.findElement(By.id("edit-email-message")).sendKeys(RandomData.getRandomData1000());
		Thread.sleep(200);
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(200);
		
		if(gm.isElementPresent("messages", "id"))
		{
			String messages4 = driver.findElement(By.id("messages")).getText().toString();
			System.out.println("OutPut message:"+messages4);
			Reporter.log("OutPut message:"+messages4);
					}
		else
		{
			Reporter.log("check the code");
		}		
	}
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		 driver.quit();
	}
}