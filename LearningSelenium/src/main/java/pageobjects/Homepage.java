package pageobjects;

import org.openqa.selenium.By;
import reusable.BrowserCall;

import java.io.IOException;

public class Homepage extends BrowserCall {
    public static By navigateSignPage = By.id("nav-link-accountList");

    public static void navigateSignInPage() throws IOException, InterruptedException {
        getDriver().findElement(navigateSignPage).click();
    }
}
