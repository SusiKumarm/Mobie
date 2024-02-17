package com.stcs;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTse {
public static void main(String[] args) {
    // Set the path to the location where you have the ChromeDriver executable
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver-win64\\chromedriver.exe");
    
   

   // C:\Users\driver\chromedriver-win64
    // Create a new instance of the ChromeDriver
    WebDriver driver=new ChromeDriver();
    
   // WebDriver driver = (WebDriver) new ChromeDriver();

    // Open Amazon website
    driver.get("https://www.amazon.com");

    // Optional: Maximize the browser window
    driver.manage().window().maximize();
  //driver.findElement(By.xpath(null))
    // You can add further actions or assertions here

    // Close the browser
    //driver.quit();
}
}