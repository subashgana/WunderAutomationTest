package com.example.a703183493.androidsampleautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class AAndroidSampleAppium {


    static AndroidDriver driver;

    static WebElement mLeftNumber;

    static WebElement mRightNumber;

    static WebElement mPlusBtn,mMinusBtn,mMulBtn,mDivideBtn,mResetBtn;

   // Copy below into the Appium Session and change the udid and devicename accordingly

   /* {
        "deviceName": "Motorola",
            "udid": "ZY22364MT7",
            "VERSION": "7.1.1",
            "automationName": "uiautomator2",
            "platformName": "Android",
            "appPackage": "com.vbanthia.androidsampleapp",
            "appActivity": "com.vbanthia.androidsampleapp.MainActivity"
    }*/

    public static void main(String[] args) {
        startMethod();
    }

    public static void startMethod() {
        // TODO Auto-generated method stub
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "Motorola");
            capabilities.setCapability(CapabilityType.VERSION, "7.1.1");
            capabilities.setCapability("udid", "ZY22364MT7"); //
            capabilities.setCapability("automationName", "uiautomator2");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "com.vbanthia.androidsampleapp");
            capabilities.setCapability("appActivity", "com.vbanthia.androidsampleapp.MainActivity");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            Thread.sleep(5000);
        } catch (Exception e) {

            System.out.print("exceptionsubash" + e.getMessage());
        }

        initId();
        doProcess();
    }
    //com.vbanthia.androidsampleapp reg ID
    private static void initId() {

        mLeftNumber = driver.findElement(By.id("inputFieldLeft"));
        mRightNumber = driver.findElement(By.id("inputFieldRight"));
        mPlusBtn = driver.findElement(By.id("additionButton"));
        mMinusBtn = driver.findElement(By.id("subtractButton"));
        mMulBtn = driver.findElement(By.id("multiplicationButton"));
        mDivideBtn = driver.findElement(By.id("divisionButton"));
        mResetBtn = driver.findElement(By.id("resetButton"));
    }

    //com.vbanthia.androidsampleapp do Process
    private static void doProcess() {
        // TODO Auto-generated method stub
        mLeftNumber.sendKeys("2");
        mRightNumber.sendKeys("2");
        mPlusBtn.click();
        mMinusBtn .click();
        mMulBtn.click();
        mDivideBtn .click();
        mResetBtn .click();
    }
}
