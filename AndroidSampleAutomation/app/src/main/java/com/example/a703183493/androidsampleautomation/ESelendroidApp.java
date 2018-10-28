package com.example.a703183493.androidsampleautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class ESelendroidApp {

    static AndroidDriver driver;


    static WebElement buttonStartWebview,waitingButtonTest,visibleButtonTest,showToastButton,topLevelElementTest;

    // Copy below into the Appium Session and change the udid and devicename accordingly

   /* {
        "deviceName": "Motorola",
            "udid": "ZY22364MT7",
            "VERSION": "7.1.1",
            "automationName": "uiautomator2",
            "platformName": "Android",
            "appPackage": "io.selendroid.testapp",
            "appActivity": "HomeScreenActivity"
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
            capabilities.setCapability("appPackage", "io.selendroid.testapp");
            capabilities.setCapability("appActivity", "HomeScreenActivity");
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

        buttonStartWebview = driver.findElement(By.id("buttonStartWebview"));
        waitingButtonTest = driver.findElement(By.id("waitingButtonTest"));
        visibleButtonTest = driver.findElement(By.id("visibleButtonTest"));
        showToastButton = driver.findElement(By.id("showToastButton"));
        topLevelElementTest = driver.findElement(By.id("topLevelElementTest"));
    }

    //com.vbanthia.androidsampleapp do Process
    private static void doProcess() {
        // TODO Auto-generated method stub
        buttonStartWebview.click();
        waitFor(2000);
        driver.pressKeyCode(AndroidKeyCode.BACK);
       // waitingButtonTest .click();
       // driver.pressKeyCode(AndroidKeyCode.BACK);
        visibleButtonTest.click();
        showToastButton .click();
        topLevelElementTest .click();
    }


    private static void waitFor(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
