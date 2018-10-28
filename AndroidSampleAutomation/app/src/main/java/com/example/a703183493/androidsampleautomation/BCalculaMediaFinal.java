package com.example.a703183493.androidsampleautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class BCalculaMediaFinal {


    static AndroidDriver driver;


    static WebElement mNota1Btn,mNota2Btn,mNota3Btn,mCalBtn;

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
            "appPackage": "com.exemplo.calculamediafinal",
            "appActivity": "com.exemplo.calculamediafinal.MediaActivity"
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
            capabilities.setCapability("appPackage", "com.exemplo.calculamediafinal");
            capabilities.setCapability("appActivity", "com.exemplo.calculamediafinal.MediaActivity");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            Thread.sleep(5000);
        } catch (Exception e) {

            System.out.print("exceptionsubash" + e.getMessage());
        }

        initId();
        doProcess();
    }
    //com.exemplo.calculamediafinal reg ID
    private static void initId() {

        mNota1Btn = driver.findElement(By.id("txtNota1"));
        mNota2Btn = driver.findElement(By.id("txtNota2"));
        mNota3Btn = driver.findElement(By.id("txtNota3"));
        mCalBtn = driver.findElement(By.id("btnCalcular"));
    }

    //com.exemplo.calculamediafinaldo Process
    private static void doProcess() {
        // TODO Auto-generated method stub
        mNota1Btn.sendKeys("1");
        mNota2Btn.sendKeys("3");
        mNota3Btn.sendKeys("5");
        mCalBtn .click();
    }
}
