package com.auto.tests.driver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverChrome {
    private static WebDriverChrome instance;
    private ChromeDriver chromeDriverInstance;

    private WebDriverChrome(){
        chromeDriverInstance = new ChromeDriver();
        chromeDriverInstance.manage().window().maximize();
        chromeDriverInstance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static WebDriverChrome getInstance(){
        if(instance == null){
            synchronized (WebDriverChrome.class){
                if(instance == null){
                    instance = new WebDriverChrome();
                }
            }
        }
        return instance;
    }

    public ChromeDriver getChromeDriver(){
        return chromeDriverInstance;
    }
}
