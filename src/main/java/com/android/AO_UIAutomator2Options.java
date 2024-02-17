package com.android;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AO_UIAutomator2Options {	
	static AppiumDriverLocalService server;
	static AndroidDriver driver;
	private static void setInstance() {
		String nodeJspath="C:\\Users\\Administrator\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
		//E:\Interview\EbackUp\eclipse-workspace\Mobile\src\test\resources\logs
		
		String exepath="C:\\Program Files\\nodejs\\node.exe";
		String logs="E:\\Interview\\EbackUp\\eclipse-workspace\\Mobile\\src\\test\\resources\\logs\\logs.txt";
		AppiumServiceBuilder builder=new AppiumServiceBuilder();
		builder.withAppiumJS(new File(nodeJspath))
		.usingDriverExecutable(new File(exepath))
		.usingPort(4723)
		.withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
		.withLogFile(new File(logs))
		.withIPAddress("127.0.0.1")
		.withTimeout(Duration.ofSeconds(300));
		server=AppiumDriverLocalService.buildService(builder);
	}



	private static AppiumDriverLocalService getInstance() {
		if (server == null) {
			setInstance();
		}
		return server;
	}

	public static void startAppiumServer() {
		try {
			getInstance().start();
			System.out.println("============Starting Appium Server==========");

			// Wait for the server to be fully started
			int waitTime = 30000; // Set a reasonable wait time (in milliseconds)
			while (!server.isRunning() && waitTime > 0) {
				Thread.sleep(1000); // Sleep for 1 second
				waitTime -= 1000;
			}

			if (server.isRunning()) {
				System.out.println("Appium Server is running. URL: " + server.getUrl());
				// Add any additional setup steps here
			} else {
				System.err.println("Appium Server did not start within the specified timeout.");
			}
		} catch (Exception e) {
			System.err.println("Error starting Appium Server: " + e.getMessage());
		}
	}

	public static void stopAppiumServer() {
		try {
			if (server != null && server.isRunning()) {
				getInstance().stop();
				System.out.println("============Stopped Appium Server==========");
			} else {
				System.out.println("Appium Server is not running.");
			}
		} catch (Exception e) {
			System.err.println("Error stopping Appium Server: " + e.getMessage());
		}
	}

	public UiAutomator2Options getApiDemoApkOptions() {
		// TODO Auto-generated method stub
		System.out.println("------Started api Demo Aok--------");
		//ClassLoader classLoader=AbsolutePathExample.class.getClassLoader();
		String fileName="E:\\MObile\\APk file\\API demos\\ApiDemos-debug.apk";
		File file=new File(fileName);
		String apkpath = file.getAbsolutePath();

		UiAutomator2Options options=new UiAutomator2Options();

		//desired capb
		options.setPlatformName("Android");
		options.setPlatformVersion("8.1");
		options.setAutomationName("UIAutomator2");

		options.setDeviceName("emulator-5554");
		options.setAppPackage("io.appium.android.apis");
		options.setAppActivity(".ApiDemos");

		//options.setApp("E:\\MObile\\APk file\\API demos\\ApiDemos-debug.apk");
		options.setApp(apkpath);
		options.setNoReset(false);


		return options;

	}
	public UiAutomator2Options getSaucelapApkOptions() {
		// TODO Auto-generated method stub
		System.out.println("------Started api Demo Aok--------");
		ClassLoader classLoader=getClass().getClassLoader();
		File file=new File(classLoader.getResource("fiel").getFile());
		String apkpath = file.getAbsolutePath();
		UiAutomator2Options options=new UiAutomator2Options();
		//desired capb
		options.setPlatformName("Android");
		options.setPlatformVersion("8.1");
		options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);

		options.setDeviceName("emulator-5554");
		options.setAppPackage("io.appium.android.apis");
		options.setAppActivity(".ApiDemos");
		options.setApp("E:\\MObile\\APk file\\API demos\\ApiDemos-debug.apk");
		options.setApp(apkpath);


		return options;

	}
	public UiAutomator2Options getWebDriverIOApkOptions() {
		// TODO Auto-generated method stub
		System.out.println("------Started api Demo Aok--------");
		ClassLoader classLoader=getClass().getClassLoader();
		File file=new File(classLoader.getResource("fiel").getFile());

		String apkpath = file.getAbsolutePath();
		UiAutomator2Options options=new UiAutomator2Options();

		//desired capb
		options.setPlatformName("Android");
		options.setPlatformVersion("8.1");
		options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);

		options.setDeviceName("emulator-5554");
		options.setAppPackage("io.appium.android.apis");
		options.setAppActivity(".ApiDemos");

		options.setApp("E:\\MObile\\APk file\\API demos\\ApiDemos-debug.apk");
		options.setApp(apkpath);


		return options;

	}
	public UiAutomator2Options getChromeOptions() {
		// TODO Auto-generated method stub
		System.out.println("------Started api Demo Aok--------");
		ClassLoader classLoader=getClass().getClassLoader();
		File file=new File(classLoader.getResource("fiel").getFile());

		String apkpath = file.getAbsolutePath();
		UiAutomator2Options options=new UiAutomator2Options();

		//desired capb
		options.setPlatformName("Android");
		options.setPlatformVersion("8.1");
		options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);

		options.setDeviceName("emulator-5554");
		options.setAppPackage("io.appium.android.apis");
		options.setAppActivity(".ApiDemos");

		options.setApp("E:\\MObile\\APk file\\API demos\\ApiDemos-debug.apk");
		options.setApp(apkpath);


		return options;

	}
}
