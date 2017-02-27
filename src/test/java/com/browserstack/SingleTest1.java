package com.browserstack;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SingleTest1 extends BrowserStackJUnitTest {

  @Test
  public void test() throws Exception {
    driver.get("https://pastebin.com");
    driver.get("http://whatismyip.akamai.com/");
    driver.get("http://localhost:3000");
    driver.get("http://google.com/ncr");
    WebElement element = driver.findElement(By.name("q"));
    element.sendKeys("BrowserStack");
    element.submit();
    Thread.sleep(5000);

    assertEquals("BrowserStack - Google Search", driver.getTitle());
  }
}
