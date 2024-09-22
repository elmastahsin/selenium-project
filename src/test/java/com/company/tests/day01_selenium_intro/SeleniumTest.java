package com.company.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //1- Setting up the web  driver manager
//        WebDriverManager.chromedriver().setup();//No need after Selneium 3.6.0
        //2- Creating instance for the ChromeDriver
        WebDriver driver = new ChromeDriver();
        //3- Using the driver instance to do some actions
        driver.get("https://www.google.com");
        driver.close();
    }

}
