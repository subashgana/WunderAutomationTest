package com.example.a703183493.androidsampleautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

public class FTrianguloApp {

    static AndroidDriver driver;


    static WebElement txtLado1, txtLado2, txtLado3, btnCalcular;

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
  "appPackage": "com.eliasnogueira.trianguloapp",
  "appActivity": "com.eliasnogueira.trianguloapp.MainActivity"
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
            capabilities.setCapability("appPackage", "com.eliasnogueira.trianguloapp");
            capabilities.setCapability("appActivity", "com.eliasnogueira.trianguloapp.MainActivity");
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

        txtLado1 = driver.findElement(By.id("txtLado1"));
        txtLado2 = driver.findElement(By.id("txtLado2"));
        txtLado3 = driver.findElement(By.id("txtLado3"));
        btnCalcular = driver.findElement(By.id("btnCalcular"));
    }

    //com.exemplo.calculamediafinaldo Process
    private static void doProcess() {
        // TODO Auto-generated method stub
        txtLado1.sendKeys("1");
        txtLado2.sendKeys("3");
        txtLado3.sendKeys("5");
        btnCalcular.click();
    }
}
