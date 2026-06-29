package org.lowes.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserAutomation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naveenpn.com");

    }
}
