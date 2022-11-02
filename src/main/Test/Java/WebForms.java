import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class WebForms extends PageObject{
    private final String email = "abdullahbinnofal19@gmail.com";
    private final String password = "Abdullah1998";
    private final String post = "Today is Tuesday";

    public WebForms (WebDriver driver){
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement Email;
    @FindBy(id = "pass")
    private WebElement pass;

    @FindBy(id = "loginbutton")
    private WebElement login_button;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/ul/li[1]/span/div/a")
    private WebElement Home_Page;


    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[1]/span")
    private WebElement Click_Post;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[1]/div[2]/div/div[1]/div/span/div")
    private WebElement Add_Photo;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[2]/div/div[1]/div/div/input")
    private WebElement Click_Photo;
//    private WebElement post_Photo;





//    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div[3]/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div[2]/div/div[3]/div/div[1]")
//    private WebElement Click_Share;


//    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div[1]/div/div[1]/div/div[1]")
//    private WebElement Share;


    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[2]/div")
    private WebElement Post;


    public void enterEmail(){
        this.Email.sendKeys(email);
    }

    public void enterPassword(){
        this.pass.sendKeys(password);
    }

    public void pressLogInButton(){
        this.login_button.click();
    }

    public void homePage(){
       this.Home_Page.click();
    }

    public void openPost(){
        this.Click_Post.click();
    }

    public void addPhoto(){
      this.Add_Photo.click();
        this.Click_Photo.sendKeys("C://Users/abdul/Pictures/Abstract Factory.png");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   //     this.post_Photo.sendKeys("C://Users//abdul//Pictures/Abstract Factory.png");
    }

       public void finalisePost(){
           this.Post.click();
       }








//    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div[3]/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div/div/div[1]/div[1]/div[1]")
//    private WebElement like;
//    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div[3]/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div/div[2]/div/div[2]/div/div[1]")
//    private WebElement Open_Comment;

//    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div[3]/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[4]/div/div/div[2]/div[3]/div/div[2]/div[1]/form/div/div/div[1]/div/div[1]")
//    private WebElement Comment;



//    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/a")
//    private WebElement View_Timeline;

//    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div/div[1]/div[2]/div/div/div/div[1]/div/div/div/div[2]/div/div[2]")
//    private WebElement update;

//    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/div[3]/div[1]/div/div[1]")
//    private WebElement Upload;



//    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/div/div[2]/div")
//    private WebElement Write_Post;







 //   public void writePost(){
 //       this.Write_Post.sendKeys(post);
 //   }



//   public void PressLike(){
 //       this.like.click();
 //  }

//   public void open_Comment(){
//        this.Open_Comment.click();
//   }

  // public void doComment(){
   //     this.Comment.sendKeys("Wow!!!");
   //     this.Comment.sendKeys(Keys.RETURN);
  // }



//   public void viewTimeline(){
 //       this.View_Timeline.click();
 //  }

//   public void updatePhoto(){
 //       this.update.click();
 //  }

//   public void chooseUpload(){
//        this.Upload.click();
//   }
}
