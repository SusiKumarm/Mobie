package com.android;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeoutException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

public class Andro {
	public static AndroidDriver driver;
	public  static void main(String[]args) throws InterruptedException, TimeoutException, IOException {
		
		AO_UIAutomator2Options.startAppiumServer();
		
		AO_UIAutomator2Options options=new AO_UIAutomator2Options();
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),
				options.getApiDemoApkOptions());	 
		AppiumbasicApplication basicflow=new AppiumbasicApplication();
		basicflow.testBasicFlow(); 
		
		AO_UIAutomator2Options.stopAppiumServer();
	}

}
	

