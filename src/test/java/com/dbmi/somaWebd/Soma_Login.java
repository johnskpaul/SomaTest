package com.dbmi.somaWebd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.dbmi.somaWebd.GenericMethods;

public class Soma_Login {
  public WebDriver driver;
  public String baseUrl;
  public static WebElement element = null;
  public StringBuffer verificationErrors = new StringBuffer();
  public JavascriptExecutor js;
  public GenericMethods gm;
  
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
    driver = new FirefoxDriver();
    baseUrl = "http://dev.apply.dbmi.pitt.edu/";
//    baseUrl = "https://act-network.org/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    js = (JavascriptExecutor) driver;
	gm = new GenericMethods(driver);
  }

//  @Test
  public void testSomaLogin() throws Exception {
    driver.get(baseUrl);
  }

	protected void adminAccount() throws InterruptedException {
		driver.findElement(By.id("edit-name")).clear();
		driver.findElement(By.id("edit-name")).sendKeys("admin");
		driver.findElement(By.id("edit-pass")).clear();
		driver.findElement(By.id("edit-pass")).sendKeys("Soma!2017");
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(200);
	}

	protected void managerAccount() throws InterruptedException {
		driver.findElement(By.id("edit-name")).clear();
		driver.findElement(By.id("edit-name")).sendKeys("manager");
		driver.findElement(By.id("edit-pass")).clear();
		driver.findElement(By.id("edit-pass")).sendKeys("Soma!2017");
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(200);
	}
    
	protected void studentAccount() throws InterruptedException {
		driver.findElement(By.id("edit-name")).clear();
		driver.findElement(By.id("edit-name")).sendKeys("studen7");
		driver.findElement(By.id("edit-pass")).clear();
		driver.findElement(By.id("edit-pass")).sendKeys("Soma!2017");
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(200);
	}
	
	protected void committeeAccount() throws InterruptedException {
		driver.findElement(By.id("edit-name")).clear();
		driver.findElement(By.id("edit-name")).sendKeys("committee");
		driver.findElement(By.id("edit-pass")).clear();
		driver.findElement(By.id("edit-pass")).sendKeys("Soma!2017");
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(200);
	}
	
	protected void ProfAccount() throws InterruptedException {
		driver.findElement(By.id("edit-name")).clear();
		driver.findElement(By.id("edit-name")).sendKeys("gCooper");
		driver.findElement(By.id("edit-pass")).clear();
		driver.findElement(By.id("edit-pass")).sendKeys("Soma!2017");
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(200);
	}
	
	protected void RecomLink() throws InterruptedException {
		driver.get("http://dev.apply.dbmi.pitt.edu/recommendation/13aa4501c5fcf6e4346bf45b596dbb9e");
		Thread.sleep(2000);
		
	}
	
	protected void wait30 () {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    }
	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
