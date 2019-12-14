package VYtracktestPackage;

import Utilities.BrowserFactory;
import Utilities.BrowserUtils;
import Utilities.StringFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestvYtrack {

    /* static String result ="";
     static String[] users = {"user45" , "user46" , "user47", "storemanager81" , "storemanager82" , "storemanager246", "salesmanager146" , "salesmanager147" , "salesmanager148"}; // user names array
     static String[] pasWords = {"UserUser123"};

     */

    public static void main(String[] args) {

        for (int i = 8; i<Credentials.getUsers().length; i++) {      // this loop is made for iterating the users array

            Credentials.setResult(Credentials.getResult() + "\n"+  (i+1) + ". TEST RESULT FOR CREDENTIALS : " +loginTest(Credentials.getUsers(i),Credentials.getPasWord()));

            }


        for (int i = 4; i < 5; i++) {       // for negative test

            String userName = StringFactory.getString(8);// we call the string factory and get some user name for fake user credentialsvvm
            String password = StringFactory.getString(8);
            String text = "";
            String testResult = loginTest(userName,password); // every time you can't call the function.if test fails we will need the results

            if (testResult.endsWith("Invalid user name or password.")){
                text  = " PASSED. Fail message was right";

           }else{
                text = testResult +" TEST FAILED";
            }

            Credentials.setResult(Credentials.getResult()  + "\n"+  (i+1) + ". TEST RESULT FOR CREDENTIALS : \"" + " User Name: "+ userName + "\" and Password: \"" + password +" \". "+ text);

        }

        System.out.println(Credentials.getResult());

        }


    public static String loginTest(String userName, String passWord) {

        String result ="";                                                                  // we will add the teat resutls here as string
        ChromeDriver browser = (ChromeDriver) BrowserFactory.getDriver("chrome");   //we created the browser and setup it from our code that we prepaired before in BrowserFactory

        browser.get("http://qa2.vytrack.com/"); // goes to the login page on chrome
        BrowserUtils.wait(1);   // it should be useful to wait while page is downloading

        WebElement login_name = browser.findElementById("prependedInput");          // assigned the place of login name on page
        WebElement login_password = browser.findElementById("prependedInput2");     // assigned the place of password on page


        login_name.sendKeys(userName);
        login_password.sendKeys(passWord);

        browser.findElementById("_submit").click(); // click to the submit button

        BrowserUtils.wait(2);

        String actualPage = browser.getTitle(); // get the actual page
        String expectedPage = "Dashboard";      // our actual page title should be "dashboard"

        if (actualPage.equals(expectedPage)) {          // if expected and actual results are the same we add the result success message
            result += "logged in successfully for credentials: "+ userName+", "+ passWord ;
        } else {                                    // but if not... we add the result by title of pages
            String failMessage = browser.findElementByXPath("//div[@class=\"alert alert-error\"]//div").getText();

            result += " couldn't get to log in \"" +
                    "the message of page was : "+failMessage;
//
        }
        browser.close();        // close the browser
        return result;         // returns the result as string
    }
}
/*
1. TEST RESULT FOR CREDENTIALS : logged in successfully for credentials: user45, UserUser123
2. TEST RESULT FOR CREDENTIALS : logged in successfully for credentials: user46, UserUser123
3. TEST RESULT FOR CREDENTIALS : logged in successfully for credentials: user47, UserUser123
4. TEST RESULT FOR CREDENTIALS : logged in successfully for credentials: storemanager81, UserUser123
5. TEST RESULT FOR CREDENTIALS : logged in successfully for credentials: storemanager82, UserUser123
6. TEST RESULT FOR CREDENTIALS : logged in successfully for credentials: storemanager246, UserUser123
7. TEST RESULT FOR CREDENTIALS : logged in successfully for credentials: salesmanager146, UserUser123
8. TEST RESULT FOR CREDENTIALS : logged in successfully for credentials: salesmanager147, UserUser123
9. TEST RESULT FOR CREDENTIALS : logged in successfully for credentials: salesmanager148, UserUser123

Process finished with exit code 0*/