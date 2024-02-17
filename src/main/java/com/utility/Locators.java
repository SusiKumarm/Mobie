package com.utility;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class Locators {
	 public By app=AppiumBy.xpath("//android.widget.TextView[@content-desc='App']");
	 public static By Activity=AppiumBy.xpath("//android.widget.TextView[@content-desc='Activity']");
	
	 public static By Alarm=AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Alarm\"]");
	 public static By AlarmCntroller=AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Alarm Controller\"]");
		
	 
	 
	 public static By Animation=AppiumBy.xpath("//android.widget.TextView[@content-desc='Animation']");
	 
	
		
}
