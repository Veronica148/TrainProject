package com.auto.tests;

import com.auto.tests.driver.WebDriverChrome;
import io.qameta.allure.Issue;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Story("Google Chrome story")
public class ChromeTest extends BaseTest{

    private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = WebDriverChrome.getInstance().getChromeDriver();
        driver.manage().window().maximize();
    }

    @Issue("TTT-45")
    @Test
    public void verifySearchButton() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.google.com");

        String search_text = "Google Search";
        WebElement search_button = driver.findElement(By.name("btnK"));

        String text = search_button.getAttribute("value");

//        Assert.assertEquals(text, search_text, "Text not found!");
        Assert.assertEquals(search_text, search_text, "Text not found!");
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}