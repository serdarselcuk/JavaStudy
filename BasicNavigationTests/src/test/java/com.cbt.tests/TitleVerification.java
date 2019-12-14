package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.BrowserUtils;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");
        String result = "";

        for(int i =0; i < urls.size(); i++){
            WebDriver browser = BrowserFactory.getBrowser("chrome");
            browser.get(urls.get(i));
            String actual = browser.getCurrentUrl().substring(0,"http://practice.cybertekschool.com.".length() );
            result += "\n"+StringUtility.CheckStrings(("http://practice.cybertekschool.com/"),actual );
            BrowserUtils.wait(1);

            browser.close();
        }
        System.out.println(result);
    }
}
