package com.dbmi.somaWebd;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SOMA_FillRecom extends Soma_Login{

//	  private boolean acceptNextAlert = true;
	
	@Test
	public void testFillRecom() throws Exception{
//		copy the link from email and paste it in Soma_Login file
		RecomLink();
		
		driver.findElement(By.id("edit-title")).sendKeys(RandomData.getRandomData25());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("edit-phone")).sendKeys(RandomNumber.getRandomNumer10());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("edit-institution")).sendKeys(RandomData.getRandomData14());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("edit-address")).sendKeys(RandomData.getRandomData14());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		WebElement country = driver.findElement(By.id("edit-country"));
		Select selCountry = new Select(country);
		selCountry.selectByVisibleText(RandomSelectSOMA.getRandomCountry());
		Thread.sleep(200);
		
		driver.findElement(By.xpath(".//*[contains(@name, 'state')]")).sendKeys(RandomData.getRandomData5());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("edit-city")).sendKeys(RandomData.getRandomData5());
		Thread.sleep(2000);
		
		// Scroll down
		js.executeScript("window.scrollBy(0, 1900);");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("edit-postal-code"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -190);");
		
		
		driver.findElement(By.id("edit-postal-code")).sendKeys(RandomNumber.getRandomNumer5());
		Thread.sleep(2000);
				
		driver.findElement(By.id(RandomSelectSOMA.whatCapacity())).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		if (gm.equals("edit-other-capacity"))
		{
		driver.findElement(By.id("edit-other-capacity")).sendKeys(RandomData.getRandomData25());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		driver.findElement(By.id("edit-known-year")).sendKeys(RandomNumber.getRandomNumer4());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("edit-known-month")).sendKeys(RandomNumber.getRandomNumer2());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement intel = driver.findElement(By.id("edit-rank-abilities"));		
		Select sel2 = new Select(intel);
		sel2.selectByVisibleText(RandomSelectSOMA.whatRank());
		Thread.sleep(2000);
		
		WebElement moti = driver.findElement(By.id("edit-rank-motivation"));		
		Select sel3 = new Select(moti);
		sel3.selectByVisibleText(RandomSelectSOMA.whatRank());
		Thread.sleep(2000);
		
		WebElement creativity = driver.findElement(By.id("edit-rank-creativity"));		
		Select sel4 = new Select(creativity);
		sel4.selectByVisibleText(RandomSelectSOMA.whatRank());
		Thread.sleep(2000);
		
		WebElement math = driver.findElement(By.id("edit-rank-math"));		
		Select sel5 = new Select(math);
		sel5.selectByVisibleText(RandomSelectSOMA.whatRank());
		Thread.sleep(2000);
		
		WebElement gk = driver.findElement(By.id("edit-rank-knowledge"));		
		Select sel6 = new Select(gk);
		sel6.selectByVisibleText(RandomSelectSOMA.whatRank());
		Thread.sleep(2000);
		
		WebElement writing = driver.findElement(By.id("edit-rank-writing"));		
		Select sel7 = new Select(writing);
		sel7.selectByVisibleText(RandomSelectSOMA.whatRank());
		Thread.sleep(2000);
		
		WebElement verbal = driver.findElement(By.id("edit-rank-verbal"));		
		Select sel8 = new Select(verbal);
		sel8.selectByVisibleText(RandomSelectSOMA.whatRank());
		Thread.sleep(2000);

		// Scroll down
		js.executeScript("window.scrollBy(0, 1900);");
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.id("edit-rank-laboratory"));
		js.executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -190);");
		
		
		WebElement lab = driver.findElement(By.id("edit-rank-laboratory"));		
		Select sel9 = new Select(lab);
		sel9.selectByVisibleText(RandomSelectSOMA.whatRank());
		Thread.sleep(2000);
		
		WebElement assign = driver.findElement(By.id("edit-rank-assignment"));		
		Select sel10 = new Select(assign);
		sel10.selectByVisibleText(RandomSelectSOMA.whatRank());
		Thread.sleep(2000);
		
		WebElement interact = driver.findElement(By.id("edit-rank-interact"));		
		Select sel11 = new Select(interact);
		sel11.selectByVisibleText(RandomSelectSOMA.whatRank());
		Thread.sleep(2000);
				
		WebElement stability = driver.findElement(By.id("edit-rank-stability"));		
		Select sel12 = new Select(stability);
		sel12.selectByVisibleText(RandomSelectSOMA.whatRank());
		Thread.sleep(2000);
		
		WebElement overall = driver.findElement(By.id("edit-rank-overall"));		
		Select sel13 = new Select(overall);
		sel13.selectByVisibleText(RandomSelectSOMA.whatRank());
		Thread.sleep(2000);
		
		// Scroll down
		js.executeScript("window.scrollBy(0, 1900);");
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.id("edit-recommenderfile"));
		js.executeScript("arguments[0].scrollIntoView(true);", element2);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -190);");
		
		driver.findElement(By.id("edit-recommenderfile")).clear();
		driver.findElement(By.id("edit-recommenderfile")).sendKeys("C:\\Users\\JOP55\\Documents\\ACT\\ACT queries for database optimization.docx");
		    
		driver.findElement(By.id("edit-recommender-message")).sendKeys(RandomData.getRandomData2000());
//		Save	
		driver.findElement(By.id("edit-save")).click();
		Thread.sleep(2000);
//		Submit
		RecomLink();

		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(2000);
		
	}
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		 driver.quit();
	}
}