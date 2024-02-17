package com.utility;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import com.android.Andro;

import ch.qos.logback.core.net.SyslogOutputStream;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ConvenientFunction extends Andro {
	@SuppressWarnings("deprecation")
	public void clickButton(WebElement webElement,String str) throws InterruptedException, TimeoutException {
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// Example usage of FluentWait
		Thread.sleep(8000);
		Wait<AndroidDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(120)) // Use java.time.Duration here
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(org.openqa.selenium.NoSuchElementException.class);
		// Your code that waits for the element
		//wait.until(driver -> webElement);
		try {
			wait.until(driver -> webElement);
			webElement.click();
			System.out.println(str+":Button Clicked in Mobile App first time");

		} catch (org.openqa.selenium.NoSuchElementException e) {
			wait.until(driver -> webElement);
			webElement.click();
			System.out.println(str+"Clicked in Mobile App 2");

			// Handle exception if needed, or just let it retry
			System.out.println(str+"Element Not present Mobile App");
		}
	}

	public static void takeScreenshot(AndroidDriver driver, String screenshotPath) throws IOException {
		// Convert the driver to TakesScreenshot
		TakesScreenshot screenshotDriver = (TakesScreenshot) driver;

		// Capture the screenshot as a file
		File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);

		// Copy the screenshot file to the destination path
		Path destinationPath = Path.of(screenshotPath);
		Files.copy(screenshotFile.toPath(), destinationPath, StandardCopyOption.REPLACE_EXISTING);

		System.out.println("Screenshot saved to: " + screenshotPath);
	}

	public static void createFolder(String folderPath) {
		File folder = new File(folderPath);
		if (!folder.exists()) {
			if (folder.mkdirs()) {
				System.out.println("Folder created: " + folderPath);
			} else {
				System.err.println("Failed to create folder: " + folderPath);
			}
		} else {
			System.out.println("Folder already exists: " + folderPath);
		}
	}


	public String getTextmd(WebElement webElement,String str) {
		return webElement.getText();

	}



}
