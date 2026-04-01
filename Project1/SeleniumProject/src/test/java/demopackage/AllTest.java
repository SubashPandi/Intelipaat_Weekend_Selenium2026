package demopackage;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AllTest {
    WebDriver d = new ChromeDriver();

    @Test()
    public void scroll() {
        d.get("https://practicetestautomation.com/blog/");
        WebElement element = d.findElement(By.linkText("open-source automation tool"));
        JavascriptExecutor js = (JavascriptExecutor) d;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    @Test()
    public void scrollBottom() throws InterruptedException {
        d.get("https://practice.expandtesting.com/");
        JavascriptExecutor js = (JavascriptExecutor) d;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        //Thread.sleep(1000);
        // d.findElement(By.linkText("Expand Testing")).click();
    }

    @Test()
    public void scrollBy() throws InterruptedException {
        d.get("https://practice.expandtesting.com/");
        JavascriptExecutor js = (JavascriptExecutor) d;
        js.executeScript("window.scrollBy(0,500)");
    }
}
