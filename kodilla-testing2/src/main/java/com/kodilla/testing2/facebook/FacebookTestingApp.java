package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
  public static final String XPATH_INPUT_DAY = "//div[5]/div[2]/span[1]/span/select";
  public static final String XPATH_INPUT_MONTH = "//div[5]/div[2]/span[1]/span/select[2]";
  public static final String XPATH_INPUT_YEAR = "//div[5]/div[2]/span[1]/span/select[3]";

  public static void main(String[] args) {
    WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
    driver.get("https://en-gb.facebook.com/r.php");

    WebElement selectComboDay = driver.findElement(By.xpath(XPATH_INPUT_DAY));
    Select selectElementDay = new Select(selectComboDay);
    selectElementDay.selectByIndex(27);

    WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_INPUT_MONTH));
    Select selectElementMonth = new Select(selectComboMonth);
    selectElementMonth.selectByIndex(4);

    WebElement selectComboYear = driver.findElement(By.xpath(XPATH_INPUT_YEAR));
    Select selectElementYear = new Select(selectComboYear);
    selectElementYear.selectByValue("1989");

  }
}
