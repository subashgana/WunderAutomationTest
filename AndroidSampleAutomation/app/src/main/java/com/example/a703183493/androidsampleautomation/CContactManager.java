package com.example.a703183493.androidsampleautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class CContactManager {

    static AndroidDriver driver;


    static WebElement maddContactButton;

    static WebElement contactNameEditText, contactPhoneEditText, contactEmailEditText,contactSaveButton;

    public static void main(String[] args) {
        startMethod();
    }

    /*{
        "deviceName": "Motorola",
            "udid": "ZY22364MT7",
            "VERSION": "7.1.1",
            "automationName": "uiautomator2",
            "platformName": "Android",
            "appPackage": "com.example.android.contactmanager",
            "appActivity": "ContactManager"
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
            capabilities.setCapability("appPackage", "com.example.android.contactmanager");
            capabilities.setCapability("appActivity", "ContactManager");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            Thread.sleep(5000);
        } catch (Exception e) {

            System.out.print("exceptionsubash" + e.getMessage());
        }

        initId();
        doProcess();
    }

    //com.example.android.contactmanager
    private static void initId() {

        maddContactButton = driver.findElement(By.id("addContactButton"));
    }



    //    //com.example.android.contactmanager
    private static void doProcess() {
        // TODO Auto-generated method stub
        maddContactButton.click();
        waitFor(1000);
        contactNameEditText = driver.findElement(By.id("contactNameEditText"));
        contactPhoneEditText = driver.findElement(By.id("contactPhoneEditText"));
        contactEmailEditText = driver.findElement(By.id("contactEmailEditText"));

        contactNameEditText.sendKeys("subash");
        contactPhoneEditText.sendKeys("+91 8660688358");
        contactEmailEditText.sendKeys("subashautomateit@gmail.com");
        driver.pressKeyCode(AndroidKeyCode.BACK);
        contactSaveButton= driver.findElement(By.id("contactSaveButton"));
        contactSaveButton.click();
    }


    private static void waitFor(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
