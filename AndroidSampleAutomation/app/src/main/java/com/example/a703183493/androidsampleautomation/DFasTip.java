package com.example.a703183493.androidsampleautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class DFasTip {

    static AndroidDriver driver;


    static WebElement billAmtEditText,calcTipButton;
    public static void main(String[] args) {
        startMethod();
    }


    //

   /* {
        "deviceName": "Motorola",
            "udid": "ZY22364MT7",
            "VERSION": "7.1.1",
            "automationName": "uiautomator2",
            "platformName": "Android",
            "appPackage": "org.traeg.fastip",
            "appActivity": "org.traeg.fastip.MainActivity"
    }*/
    public static void startMethod() {
        // TODO Auto-generated method stub
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "Motorola");
            capabilities.setCapability(CapabilityType.VERSION, "7.1.1");
            capabilities.setCapability("udid", "ZY22364MT7"); //
            capabilities.setCapability("automationName", "uiautomator2");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "org.traeg.fastip");
            capabilities.setCapability("appActivity", "org.traeg.fastip.MainActivity");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            Thread.sleep(5000);
        } catch (Exception e) {

            System.out.print("exceptionsubash" + e.getMessage());
        }

        initId();
        doProcess();
    }
    //org.traeg.fastip.SettingsActivity
    private static void initId() {

        billAmtEditText = driver.findElement(By.id("billAmtEditText"));
        calcTipButton = driver.findElement(By.id("calcTipButton"));
    }

    //org.traeg.fastip.SettingsActivity
    private static void doProcess() {
        // TODO Auto-generated method stub
        billAmtEditText.sendKeys("1");
        calcTipButton .click();
    }
}
