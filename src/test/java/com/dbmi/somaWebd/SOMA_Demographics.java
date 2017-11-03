package com.dbmi.somaWebd;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SOMA_Demographics extends Soma_Login{

//	  private boolean acceptNextAlert = true;
	
	@Test
	public void testEmployment() throws Exception{
		testSomaLogin();
		studentAccount();
		driver.findElement(By.linkText("My Application")).click();
		Thread.sleep(200);
		//Employment
		driver.findElement(By.linkText("Demographics")).click();
		Thread.sleep(200);

		WebElement gender = driver.findElement(By.id("edit-gender"));
		Select selGender = new Select(gender);
		selGender.selectByVisibleText(RandomSelectSOMA.getOptMFD());
		Thread.sleep(200);

		WebElement hispanic = driver.findElement(By.id("edit-is-hispanic"));
		Select selHispanic = new Select(hispanic);
		selHispanic.selectByVisibleText(RandomSelectSOMA.getOptYND());
		Thread.sleep(200);

		driver.findElement(By.id("edit-racial-"+RandomSelectSOMA.getRandomRadOpt6())).click();
		Thread.sleep(200);
		
		// Scroll down
		js.executeScript("window.scrollBy(0, 1900);");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("edit-is-disability"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -190);");
		
		
		WebElement disability = driver.findElement(By.id("edit-is-disability"));
		Select seldisability = new Select(disability);
		seldisability.selectByVisibleText(RandomSelectSOMA.getOptYND());
		Thread.sleep(200);
		
		boolean result = gm.isElementPresent("edit-disability-learning","id");
		System.out.println("Is Element Present: "+ result);
		
		if(driver.findElement(By.id("edit-disability-learning")).isDisplayed())
			
//		if(gm.isElementPresent("edit-disability-learning", "id"))
		{
			driver.findElement(By.id("edit-disability-"+RandomSelectSOMA.getOptDisAbl())).click();
		}
				
		WebElement disadvantaged = driver.findElement(By.id("edit-is-disadvantaged"));
		Select seldisadvantaged = new Select(disadvantaged);
		seldisadvantaged.selectByVisibleText(RandomSelectSOMA.getOptYND());
		Thread.sleep(200);
				
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(200);
		
		
		if(gm.isElementPresent("messages", "id"))
		{
			String messages2 = driver.findElement(By.id("messages")).getText().toString();
			System.out.println("OutPut message:"+messages2);	
		}
		else {
			System.out.println("No messages appeared check the code");
		}

	}
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		 driver.quit();
	}
}