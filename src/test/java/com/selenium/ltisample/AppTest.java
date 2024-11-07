package com.selenium.ltisample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	
	@Parameters("browsertype")
	@Test(groups = {"smoke","regression"})
    public void searchSelenium(@Optional("chrome") String browserType) {
        WebDriver driver = null;
        if(browserType.equals("chrome"))
        {driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");}
        if(browserType.equals("firefox"))
        {driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");}
        driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
       
    }
	
	
	@Parameters("browsertype")
	@Test(groups = {"regression"})
    public void searchCucumber(@Optional("chrome") String browserType) {
        WebDriver driver = null;
        if(browserType.equals("chrome"))
        {driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");}
        if(browserType.equals("firefox"))
        {driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Cucumber",Keys.ENTER);
        }
       
    }
	
	@Parameters("browsertype")
	@Test(groups = {"smoke","regression"})
    public void searchApple(@Optional("chrome") String browserType) {
        WebDriver driver = null;
        if(browserType.equals("chrome"))
        {driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");}
        if(browserType.equals("firefox"))
        {driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Apple",Keys.ENTER);
        }
       
    }
}
