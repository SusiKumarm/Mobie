package com.android;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.utility.ConvenientFunction;
import com.utility.Locators;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AppiumbasicApplication extends Andro{
	public static ConvenientFunction cf=new ConvenientFunction();
	Locators getLocator=new Locators();

	//static AndroidDriver driver;

	public void testBasicFlow() throws InterruptedException, TimeoutException, IOException {
		// TODO Auto-generated method stub
		//Thread.sleep(3000);
		//		
		//		String screenshotsFolderPath = "E:\\Interview\\EbackUp\\eclipse-workspace\\Mobile\\src\\test\\resource\\Result";
		//        cf.createFolder(screenshotsFolderPath);
		//      cf.takeScreenshot(driver, "E:\\Interview\\EbackUp\\eclipse-workspace\\Mobile\\src\\test\\resources\\Result" + "/TestCase1.png");


		cf.clickButton(driver.findElement(getLocator.app),"App");
		
		Thread.sleep(2000);
		cf.clickButton(driver.findElement(getLocator.Alarm),"Alarm");
		Thread.sleep(2000);
		cf.clickButton(driver.findElement(getLocator.AlarmCntroller),"Alarm Controller");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.quit();


		//		//android.widget.TextView[@content-desc="App"]
		//		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='App']")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Activity']")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Animation']")).click();
		//		
		//		

	}

}
