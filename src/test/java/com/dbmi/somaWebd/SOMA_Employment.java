package com.dbmi.somaWebd;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SOMA_Employment extends Soma_Login{

//	  private boolean acceptNextAlert = true;
	
	@Test
	public void testEmployment() throws Exception{
		testSomaLogin();
		studentAccount();
		driver.findElement(By.linkText("My Application")).click();
		Thread.sleep(200);
		//Employment
		driver.findElement(By.linkText("Employment")).click();
		Thread.sleep(200);
		
		WebElement work = driver.findElement(By.xpath(".//*[@name='work_type1']"));
		Select selwork = new Select(work);
		selwork.selectByVisibleText(RandomSelectSOMA.getOptTypWork());
		
			driver.findElement(By.xpath(".//*[@name='company_name1']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
			driver.findElement(By.xpath(".//*[@name='position1']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
			driver.findElement(By.xpath(".//*[@name='address_11']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
			driver.findElement(By.xpath(".//*[@name='address_21']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
		
		Thread.sleep(200);
		WebElement country = driver.findElement(By.xpath(".//*[@name='country1']"));
		Select Selcountry = new Select(country);
		Selcountry.selectByVisibleText(RandomSelectSOMA.getRandomCountry());
		
			driver.findElement(By.xpath(".//*[@name='state1']")).sendKeys(RandomData.getRandomData5());
			driver.findElement(By.xpath(".//*[@name='city1']")).sendKeys(RandomData.getRandomData5());
			driver.findElement(By.xpath(".//*[@name='postal_code1']")).sendKeys(RandomData.getRandomData5());

		driver.findElement(By.xpath(".//*[@name='from_date1[date]']")).clear();			
		driver.findElement(By.xpath(".//*[@name='from_date1[date]']")).sendKeys(RandomDate.getRandomPastDate5());
		driver.findElement(By.xpath(".//*[@name='to_date1[date]']")).clear();
		driver.findElement(By.xpath(".//*[@name='to_date1[date]']")).sendKeys(RandomDate.getRandomDate5());

			
//			entering data again			
			driver.findElement(By.xpath(".//*[@name='company_name1']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
			driver.findElement(By.xpath(".//*[@name='position1']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
			driver.findElement(By.xpath(".//*[@name='address_11']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
			driver.findElement(By.xpath(".//*[@name='address_21']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
			driver.findElement(By.xpath(".//*[@name='state1']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
//			}
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
		
		driver.findElement(By.id("edit-add-more")).click();
		Thread.sleep(200);
		
		WebElement work2 = driver.findElement(By.xpath(".//*[@name='work_type2']"));
		Select selwork2 = new Select(work2);
		selwork2.selectByVisibleText(RandomSelectSOMA.getOptTypWork());
		
			driver.findElement(By.xpath(".//*[@name='company_name2']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
			driver.findElement(By.xpath(".//*[@name='position2']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
			driver.findElement(By.xpath(".//*[@name='address_12']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
			driver.findElement(By.xpath(".//*[@name='address_22']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
		
		Thread.sleep(200);
		WebElement country2 = driver.findElement(By.xpath(".//*[@name='country2']"));
		Select Selcountry2 = new Select(country2);
		Selcountry2.selectByVisibleText(RandomSelectSOMA.getRandomCountry());
		
			driver.findElement(By.xpath(".//*[@name='state2']")).sendKeys(RandomData.getRandomData5());
			driver.findElement(By.xpath(".//*[@name='city2']")).sendKeys(RandomData.getRandomData5());
			driver.findElement(By.xpath(".//*[@name='postal_code2']")).sendKeys(RandomData.getRandomData5());
			driver.findElement(By.xpath(".//*[@name='from_date2[date]']")).clear();
		driver.findElement(By.xpath(".//*[@name='from_date2[date]']")).sendKeys(RandomDate.getRandomPastDate5());
		driver.findElement(By.xpath(".//*[@name='to_date2[date]']")).clear();
		driver.findElement(By.xpath(".//*[@name='to_date2[date]']")).sendKeys(RandomDate.getRandomDate5());

			
//			entering data again			
			driver.findElement(By.xpath(".//*[@name='company_name2']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
			driver.findElement(By.xpath(".//*[@name='position2']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
			driver.findElement(By.xpath(".//*[@name='address_12']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
			driver.findElement(By.xpath(".//*[@name='address_22']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
			driver.findElement(By.xpath(".//*[@name='state2']")).sendKeys(RandomData.getRandomData5());
			Thread.sleep(50);
//			}
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