package com.dbmi.somaWebd;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SOMA_Manage extends Soma_Login{

//	  private boolean acceptNextAlert = true;
	
	@Test
	public void testManage() throws Exception{
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
		
		WebElement progr = driver.findElement(By.id("edit-progress"));
		Select Sel3 = new Select(progr);
		Sel3.selectByVisibleText("Ready for triage");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath(".//*[contains(@value, 'Save')]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
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
		
		driver.findElement(By.id("edit-other-test")).sendKeys(RandomData.getRandomData250());
		wait30();
		
		driver.findElement(By.xpath(".//*[contains(@value, 'Save')]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
		driver.findElement(By.id("edit-card-number")).sendKeys(RandomNumber.getRandomNumer14());
		Thread.sleep(2000);
		WebElement cardType = driver.findElement(By.id("edit-card-type"));		
		Select sel3 = new Select(cardType);
		sel3.selectByVisibleText("MasterCard");
		Thread.sleep(2000);

		WebElement month = driver.findElement(By.id("edit-month"));		
		Select sel4 = new Select(month);
		sel4.selectByVisibleText("12");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.id("edit-year"));		
		Select sel5 = new Select(year);
		sel5.selectByVisibleText("2022");
		Thread.sleep(2000);
		
		driver.findElement(By.id("edit-code")).sendKeys(RandomNumber.getRandomNumer3());
		Thread.sleep(2000);
		
		driver.findElement(By.id("edit-fname")).sendKeys(RandomData.getRandomData5());
		Thread.sleep(2000);
		
		driver.findElement(By.id("edit-lname")).sendKeys(RandomData.getRandomData5());
		Thread.sleep(2000);
		
		driver.findElement(By.id("edit-address")).sendKeys(RandomData.getRandomData14());
		Thread.sleep(2000);
		
		// Scroll down
		js.executeScript("window.scrollBy(0, 1900);");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("edit-country"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -190);");
		
		
		WebElement country = driver.findElement(By.id("edit-country"));
		Select selCountry = new Select(country);
		selCountry.selectByVisibleText(RandomSelectSOMA.getRandomCountry());
		Thread.sleep(200);
		
		driver.findElement(By.xpath(".//*[contains(@name, 'state')]")).sendKeys(RandomData.getRandomData5());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("edit-city")).sendKeys(RandomData.getRandomData5());
		Thread.sleep(2000);
		
		driver.findElement(By.id("edit-zip")).sendKeys(RandomNumber.getRandomNumer5());
		Thread.sleep(2000);

//		store current window
		String winHandleBefore = driver.getWindowHandle();
						
		driver.findElement(By.id("edit-button")).click();
		Thread.sleep(2000);

		for (String winHandle : driver.getWindowHandles()) 
		{
			driver.switchTo().window(winHandle);
		}
			
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(3000);
		
		WebElement check = driver.findElement(By.id("edit-payment-type"));		
		Select selCheck = new Select(check);
		selCheck.selectByVisibleText("Check");
		Thread.sleep(2000);
		driver.findElement(By.linkText("voucher")).click();	
		Thread.sleep(2000);
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(2000);		
		
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