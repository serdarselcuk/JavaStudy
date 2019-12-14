package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.BrowserUtils;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification1 {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");
        String result = "";

        for(int i =0; i < urls.size(); i++){

            WebDriver browser = BrowserFactory.getBrowser("chrome");

            browser.get(urls.get(i));
            String url = browser.getCurrentUrl();
            String title = browser.getTitle().replaceAll(" ","").toLowerCase();

            result += "\nfor "+urls.get(i)+" contains it's title for \" " + browser.getTitle() + "\" is = "+(url.contains(title));

            BrowserUtils.wait(1);

            browser.close();
        }
        System.out.println(result);
        /*
        for https://luluandgeorgia.com contains it's title for " Lulu and Georgia" is = true
        for https://wayfair.com/ contains it's title for " Wayfair.com - Online Home Store for Furniture, Decor, Outdoors & More" is = false
        for https://walmart.com contains it's title for " Walmart.com | Save Money. Live Better." is = false
        for https://westelm.com/ contains it's title for " Modern Furniture, Home Decor & Home Accessories | west elm" is = false
        */
    }
}