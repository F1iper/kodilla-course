package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {

  public final static String FIREFOX = "FIREFOX_DRIVER";
  public final static String CHROME = "CHROME_DRIVER";

  public static WebDriver getDriver(final String driver) {
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium-drivers\\Chrome\\chromedriver.exe");
    System.setProperty("webdriver.gecko.driver", "D:\\Selenium-drivers\\Firefox\\geckodriver.exe");

    if (driver.equals(FIREFOX)) return new FirefoxDriver();
    else if (driver.equals(CHROME)) return new ChromeDriver();
    else return null;

  }
}
