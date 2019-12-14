package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static String getTitle(String urls){

        WebDriver browser = BrowserFactory.getBrowser("chrome");
        browser.get(urls);

        String actualTitle = browser.getTitle();

        browser.close();

        return actualTitle;

    }

    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");


        for(int i =0; i < urls.size(); i++){
            String expected = getTitle(urls.get(i).substring(0,"http://practice.cybertekschool.com.".length() ));
            StringUtility.CheckStrings(("http://practice.cybertekschool.com."),expected );
        }

    }
}
