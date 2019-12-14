package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.BrowserUtils;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) {



        WebDriver chrome = BrowserFactory.getBrowser("chrome");
        chrome.get("http://google.com");
        BrowserUtils.wait(2);
        chrome.close();

        WebDriver safari = BrowserFactory.getBrowser("safari");
        safari.get("http://google.com");
        BrowserUtils.wait(2);
        safari.close();

        WebDriver firefox = BrowserFactory.getBrowser("firefox");
        firefox.get("http://google.com");
        BrowserUtils.wait(2);
        firefox.close();
    }
}
