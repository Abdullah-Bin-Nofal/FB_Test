import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();
    static String actual_URL;

    @BeforeSuite
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", Utils.Chrome_Driver_Location);
    }

    @Test(testName = "Log in into Facebook")
    public void LogIn(){
        driver.navigate().to(Utils.Base_URL);
       // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebForms webform = new WebForms(driver);
        webform.enterEmail();
        webform.enterPassword();
        webform.pressLogInButton();
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       // actual_URL = driver.getCurrentUrl();
        //System.out.println(actual_URL);
        //Assert.assertEquals(actual_URL, Utils.expected_URL);
      webform.Menu();
      webform.pressLogOut();
      //  actual_URL = driver.getCurrentUrl();
       // System.out.println(actual_URL);
        //Assert.assertEquals(actual_URL, Utils.Base_URL);
    }

//    @Test(testName = "Logout")
 //   public void Logout(){
  //      driver.navigate().to(Utils.expected_URL);
   //     WebForms webForm = new WebForms(driver);
    //    webForm.pressLogOut();
     //   actual_URL = driver.getCurrentUrl();
    //  Assert.assertEquals(actual_URL, Utils.Base_URL);
    //}

   // @AfterSuite
    //public static void cleanUp(){
     //   driver.manage().deleteAllCookies();
      //  driver.close();
    //}
}
