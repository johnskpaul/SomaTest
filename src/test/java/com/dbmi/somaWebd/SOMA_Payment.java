package com.dbmi.somaWebd;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SOMA_Payment extends Soma_Login{

//	  private boolean acceptNextAlert = true;
	
	@Test
	public void testPyment() throws Exception{
		testSomaLogin();
		studentAccount();
		driver.findElement(By.linkText("My Application")).click();
		Thread.sleep(200);
		//Employment
		driver.findElement(By.linkText("Payment")).click();
		Thread.sleep(200);

		WebElement card = driver.findElement(By.id("edit-payment-type"));
		Select sel2 = new Select(card);
		sel2.selectByVisibleText("Credit card");
		Thread.sleep(2000);
		
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
		
		driver.navigate().refresh();
		
		for (String winHandle : driver.getWindowHandles()) 
		{
			driver.switchTo().window(winHandle);
		}
		
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(3000);
		
		WebElement check = driver.findElement(By.id("edit-payment-type"));		
		Select sel = new Select(check);
		sel.selectByVisibleText("Check");
		Thread.sleep(2000);
//		driver.findElement(By.linkText("voucher")).click();	
//		Thread.sleep(2000);
//		driver.switchTo().window(winHandleBefore);
//		Thread.sleep(3000);
		
		
//		driver.findElement(By.xpath(".//*[contains(@id, 'verify')]")).sendKeys(RandomData.getRandomData5());
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		driver.findElement(By.xpath(".//*[contains(@id, 'submit')]")).sendKeys(RandomData.getRandomData5());
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[contains(@id, 'submit-app')]")).sendKeys(RandomData.getRandomData5());
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