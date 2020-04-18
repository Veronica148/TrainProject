package com.auto.tests.listeners;

import com.auto.tests.driver.WebDriverChrome;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class AllureAttachmentListener extends TestListenerAdapter {
    @Attachment(value = "Attachment: {0}", type = "image/png")
    public byte[] makeScreenshot() {
        byte[] array ={1};
        try {
            return ((TakesScreenshot) WebDriverChrome.getInstance().getChromeDriver()).getScreenshotAs(OutputType.BYTES);
        } catch (WebDriverException e){
            e.printStackTrace();
        }
        return array;
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        makeScreenshot();
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        makeScreenshot();
    }
}
