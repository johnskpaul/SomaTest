package com.dbmi.somaWebd;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SOMA_Bio extends Soma_Login {


	@Test
	public void testSOMA_Bio() throws Exception {
		
		testSomaLogin();
		studentAccount();
		driver.findElement(By.linkText("My Application")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Bio")).click();
		Thread.sleep(200);
				
		if(driver.findElement(By.id("edit-image-fid-upload")) != null)
		{
			 driver.findElement(By.name("files[image_fid]")).clear();
			    driver.findElement(By.name("files[image_fid]")).sendKeys("C:\\Users\\JOP55\\Pictures\\cherubin.jpg");
			  driver.findElement(By.id("edit-image-fid-upload-button")).click();

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (driver.findElement(By.linkText("cherubin.jpg")) != null ) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		}
		else
		driver.findElement(By.id("edit-ssn")).clear();
	    driver.findElement(By.id("edit-ssn")).sendKeys(RandomNumber.getRandomNumer4());
		Thread.sleep(200);
		driver.findElement(By.id("edit-dob-datepicker-popup-0")).sendKeys(RandomDate.getRandomPastDate510());
		driver.findElement(By.id("edit-first-name")).click();
		
		driver.findElement(By.id("edit-first-name")).sendKeys("aa"+RandomData.getRandomData5());
		driver.findElement(By.id("edit-last-name")).sendKeys("aaa"+RandomData.getRandomData5());
		driver.findElement(By.id("edit-middle-name")).sendKeys(RandomData.getRandomData5());
		driver.findElement(By.id("edit-suffix")).sendKeys("Mr/Ms");
		
		WebElement citizen = driver.findElement(By.id("edit-citizenship-type"));
		Select sel = new Select(citizen);
		sel.selectByVisibleText(RandomSelectSOMA.getOptCityShipType());
		Thread.sleep(200);
		
		WebElement country = driver.findElement(By.id("edit-citizenship-country"));
		Select sel2 = new Select(country);
		sel2.selectByVisibleText(RandomSelectSOMA.getRandomCountry());
		Thread.sleep(200);
		
		WebElement birthcountry = driver.findElement(By.id("edit-birth-country"));
		Select sel3 = new Select(birthcountry);
		sel3.selectByVisibleText(RandomSelectSOMA.getRandomCountry());
		Thread.sleep(200);
		
		driver.findElement(By.id(RandomSelectSOMA.getVetOptyesnoRadio())).click();
		Thread.sleep(200);
		
		driver.findElement(By.id(RandomSelectSOMA.getEduOptyesnoRadio())).click();
		Thread.sleep(200);
		
		WebElement visa = driver.findElement(By.id("edit-visa-type"));
		Select sel4 = new Select(visa);
		sel4.selectByVisibleText(RandomSelectSOMA.getOptVisaType());
		Thread.sleep(200);
		
		driver.findElement(By.id("edit-visa-number")).sendKeys(RandomNumber.getRandomNumer9());
		Thread.sleep(200);
		
		WebElement Res = driver.findElement(By.id("edit-pa-residency"));
		Select sel5 = new Select(Res);
		sel5.selectByVisibleText(RandomSelectSOMA.getOptPennRes());
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