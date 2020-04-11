package com.auto.tests.driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverChrome {
    private static WebDriverChrome instance;
    private ChromeDriver chromeDriverInstance;

    private WebDriverChrome(){
        chromeDriverInstance = new ChromeDriver();
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
