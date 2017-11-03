package com.dbmi.somaWebd;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SOMA_Contact extends Soma_Login{

//	  private boolean acceptNextAlert = true;
	
	@Test
	public void testContact() throws Exception{
		testSomaLogin();
		studentAccount();
		driver.findElement(By.linkText("My Application")).click();
		Thread.sleep(200);
		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(200);
		
		driver.findElement(By.id("edit-perm-address-1")).click();
		driver.findElement(By.id("edit-perm-address-1")).clear();
		driver.findElement(By.id("edit-perm-address-1")).sendKeys(RandomData.getRandomData5());
		driver.findElement(By.id("edit-perm-address-2")).click();
		driver.findElement(By.id("edit-perm-address-2")).clear();
		driver.findElement(By.id("edit-perm-address-2")).sendKeys(RandomData.getRandomData5());
		
		

//		if(driver.findElements(By.id("edit-perm-state--2")) != null )
//		{
//		driver.findElement(By.id("edit-perm-state--2")).sendKeys(RandomData.getRandomData5());
//		}
//		else
		driver.findElement(By.id("edit-home-state")).click();
		driver.findElement(By.id("edit-home-state")).clear();
		driver.findElement(By.id("edit-perm-state")).sendKeys(RandomData.getRandomData5());
		Thread.sleep(200);
		driver.findElement(By.id("edit-perm-city")).sendKeys(RandomData.getRandomData5());
		driver.findElement(By.id("edit-perm-postal-code")).sendKeys(RandomNumber.getRandomNumer5());
		driver.findElement(By.id("edit-home-address-1")).sendKeys(RandomData.getRandomData5());
		driver.findElement(By.id("edit-home-address-2")).sendKeys(RandomData.getRandomData5());

		WebElement permCountry = driver.findElement(By.id("edit-perm-country"));
		Select sel = new Select(permCountry);
		sel.selectByVisibleText(RandomSelectSOMA.getRandomCountry());

		driver.findElement(By.id("edit-home-state")).click();
		driver.findElement(By.id("edit-home-state")).clear();
		driver.findElement(By.id("edit-home-state")).sendKeys(RandomData.getRandomData5());

		// Scroll down
		js.executeScript("window.scrollBy(0, 1900);");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("edit-perm-country"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -190);");
		
		WebElement homeCountry = driver.findElement(By.id("edit-home-country"));
		Select sel2 = new Select(homeCountry);
		sel2.selectByVisibleText(RandomSelectSOMA.getRandomCountry());
		
		driver.findElement(By.id("edit-home-city")).sendKeys(RandomData.getRandomData5());
		driver.findElement(By.id("edit-home-postal-code")).sendKeys(RandomData.getRandomData5());
		driver.findElement(By.id("edit-prim-phone")).clear();
		driver.findElement(By.id("edit-prim-phone")).sendKeys(RandomNumber.getRandomNumer10());
		driver.findElement(By.id("edit-contact-pref-mail-to-home-address")).click();
		driver.findElement(By.id("edit-contact-from-date-datepicker-popup-0")).clear();
		driver.findElement(By.id("edit-contact-from-date-datepicker-popup-0")).sendKeys(RandomDate.getRandomDate5());
		driver.findElement(By.id("edit-alter-phone")).clear();
		driver.findElement(By.id("edit-alter-phone")).sendKeys(RandomNumber.getRandomNumer10());
		driver.findElement(By.id("edit-contact-time-am")).click();
		driver.findElement(By.id("edit-contact-time-pm")).click();
		driver.findElement(By.id("edit-contact-to-date-datepicker-popup-0")).clear();
		driver.findElement(By.id("edit-contact-to-date-datepicker-popup-0")).sendKeys(RandomDate.getRandomDate5());
		
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