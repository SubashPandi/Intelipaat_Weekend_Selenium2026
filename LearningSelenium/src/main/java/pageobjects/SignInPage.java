package pageobjects;

import org.openqa.selenium.By;
import reusable.BrowserCall;

public class SignInPage extends BrowserCall {


    public static By enterEmail =By.id("ap_email_login");
    public static By continueButton =By.id("continue");
    public static By enterPwd =By.id("ap_password");
    public static By clickSignIn =By.id("signInSubmit");
    public static By errorMessage = By.xpath("//div[@class='a-alert-content' and normalize-space()='Your password is incorrect']");
    public static void enterEmail(String username){
        getDriver().findElement(enterEmail).sendKeys(username);
    }
    public static void clickContinue()
    {
        getDriver().findElement(continueButton).click();
    }
    public static void enterPwd(String pwd){
        getDriver().findElement(enterPwd).sendKeys(pwd);
    }
    public static void signIn(){
        getDriver().findElement(clickSignIn).click();
    }
    public static String getErrorMessage(){
       return getDriver().findElement(errorMessage).getText();
    }
}
