package com.auto.tests;

import com.auto.tests.driver.WebDriverChrome;
import io.qameta.allure.Issue;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Story("Google Chrome2 story")
public class Chrome2Test extends BaseTest{

    @BeforeClass
    public void setUp(){
//        driver = WebDriverChrome.getInstance().getChromeDriver();
    }

    @Issue("TTT-55")
    @Test
    public void verifySearchButton() {

        driver.get("http://www.google.com");
        String search_text = "Google Search";
        WebElement search_button = driver.findElement(By.name("btnK"));
        String text = search_button.getAttribute("value");

        Assert.assertEquals(search_text, search_text, "Text not found!");
    }
}