package pageobjects;

import org.openqa.selenium.By;
import reusable.BrowserCall;

public class SignInPage extends BrowserCall {


    public static By enterEmail =By.id("ap_email_login");
    public static By continueButton =By.id("continue");
    public static By enterPwd =By.id("ap_password");
    public static By clickSignIn =By.id("signInSubmit");
    public static void enterEmail(String username){
        d.findElement(enterEmail).sendKeys(username);
    }
    public static void clickContinue()
    {
        d.findElement(continueButton).click();
    }
    public static void enterPwd(String pwd){
        d.findElement(enterPwd).sendKeys(pwd);
    }
    public static void signIn(){
        d.findElement(clickSignIn).click();
    }
}
