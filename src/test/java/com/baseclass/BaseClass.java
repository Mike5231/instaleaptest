package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

public class BaseClass {

    protected WebDriver driver;

    @BeforeTest
    public void setupParameters() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "src/test/java/com/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

 @AfterTest
    public void tearDown(){
        this.driver.quit();
    }


}
