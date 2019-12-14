package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    private static String oS;

    static {
        oS = System.getProperty("os.name");
    }

    public static WebDriver getBrowser(String browser){

        if(oS.substring(0,3).equalsIgnoreCase("win") && browser.substring(0,3).equalsIgnoreCase("saf") || oS.substring(0,3).equalsIgnoreCase("mac") && browser.substring(0,3).equalsIgnoreCase("edg")  ){
            System.out.println("Incompetible OS and Browser !");
            return null;
        }else if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            return driver;
        }else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxDriver driver = new FirefoxDriver();
            return driver;
        }else if (browser.equalsIgnoreCase("safari")){
            SafariDriver driver = new SafariDriver();
            return driver;
        }else{
            WebDriverManager.edgedriver().setup();
            EdgeDriver driver = new EdgeDriver();
            return  driver;
        }

    }
}
