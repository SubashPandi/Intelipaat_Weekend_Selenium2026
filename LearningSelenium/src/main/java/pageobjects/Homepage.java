package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BrowserCall;

import java.io.IOException;

public class Homepage extends BrowserCall {
    public static By navigateSignPage = By.id("nav-link-accountList");
    public static By searchBox = By.id("twotabsearchtextbox");
    public static By searchButton = By.id("nav-search-submit-button");

    public static void navigateSignInPage() throws IOException, InterruptedException {
        getDriver().findElement(navigateSignPage).click();
    }

    public static void searchKeyword(String product) throws InterruptedException {
        getDriver().findElement(searchBox).sendKeys(product);
    }

    public static void clickSearchButton() {
        getDriver().findElement(searchButton).click();
    }

    public static void hoverMouse() {
        WebElement hover = getDriver().findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions hoverAction= new Actions(getDriver());
        //hoverAction.clickAndHold(hover).build().perform();
        hoverAction.moveToElement(hover).perform();
    }
    public static void babyList() {
        getDriver().findElement(By.linkText("Baby Wishlist")).click();
    }
}
