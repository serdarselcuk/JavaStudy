import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import

public class LoginTest {
     /* static String result ="";
     static String[] users = {"user45" , "user46" , "user47", "storemanager81" , "storemanager82" , "storemanager246", "salesmanager146" , "salesmanager147" , "salesmanager148"}; // user names array
     static String[] pasWords = {"UserUser123"};

     */


    public static void main(String[] args) {

        for (int i = 0; i<CredentialsForvYtrack.getUsers().length; i++) {      // this loop is made for iterating the users array

            CredentialsForvYtrack.setResult(CredentialsForvYtrack.getResult() + "\n"+  (i+1) + ". TEST RESULT FOR CREDENTIALS : " +LoginTest.loginTest(CredentialsForvYtrack.getUsers(i),CredentialsForvYtrack.getPasWord()));

        }
        System.out.println(CredentialsForvYtrack.getResult());
    }




    public static String loginTest(String userName, String passWord) {

        String result =""; // we will add the teat resutls here as string

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
            result += "couldn't get to log in by " + userName + "  " + passWord+
                    " the title of the page is " + actualPage + " but it should have been " + expectedPage;
        }
        browser.close();        // close the browser
        return result;         // returns the result as string
    }
}
}
