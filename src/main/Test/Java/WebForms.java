import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForms extends PageObject{
    private final String email = "abdullahbinnofal19@gmail.com";
    private final String password = "Abdullah1998";

    public WebForms(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement Email;

    @FindBy(id = "pass")
    private WebElement pass;

    @FindBy(id = "loginbutton")
    private WebElement login_button;

   @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div[1]/span")
    private WebElement menu;

    @FindBy(className = "xu06os2 x1ok221b")
    private WebElement logout_button;

    public void enterEmail(){
        this.Email.sendKeys(email);
    }

    public void enterPassword(){
        this.pass.sendKeys(password);
    }

    public void pressLogInButton(){
        this.login_button.click();
    }

    public void Menu(){
        this.menu.click();
    }

    public void pressLogOut(){
        this.logout_button.click();
    }

}
