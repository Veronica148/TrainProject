package com.auto.tests.dockerDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeDemo {

    @Test
    public void testApp() throws MalformedURLException, InterruptedException {
        System.out.println("Test for Chrome");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(BrowserType.CHROME);
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Automation");
        Thread.sleep(5000);
        driver.quit();
    }
}
