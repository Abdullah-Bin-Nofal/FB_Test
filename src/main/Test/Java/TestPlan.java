import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        webform.homePage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String current_URL = driver.getCurrentUrl();
        driver.navigate().to(current_URL);
        JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,300)");
        webform.openPost();
        webform.addPhoto();
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[2]/div")));
        webform.finalisePost();
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);















//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1075)");
//        webform.PressLike();
//        webform.open_Comment();
//        webform.doComment();
//        webform.clickShare();
//        webform.postShare();
//        js.executeScript("window.scrollBy(0,-800)");
//        webform.viewTimeline();

 //
 //       webform.writePost();
 //       webform.finalisePost();

//        webform.viewTimeline();
//        webform.updatePhoto();
        //  webform.chooseUpload();

    }

   // @AfterSuite
    //public static void cleanUp(){
     //   driver.manage().deleteAllCookies();
      //  driver.close();
    //}
}
