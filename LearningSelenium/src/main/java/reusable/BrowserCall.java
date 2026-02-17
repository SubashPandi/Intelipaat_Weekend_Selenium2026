package reusable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BrowserCall {
    //public static WebDriver d;

    private static ThreadLocal<WebDriver> th = new ThreadLocal<>();
    public static Properties prob;
    public static ChromeOptions options = new ChromeOptions();

    public static WebDriver browserInvoc() throws IOException, InterruptedException {
        FileInputStream fis = new FileInputStream("src/main/resources/Utility/Config.properties");
        prob = new Properties();
        prob.load(fis);

        switch (prob.getProperty("browser").toLowerCase()) {
            case ("chrome"):
                th.set(new ChromeDriver());
                options.addArguments("--remote-allow-origins=*");
                break;
            case ("edge"):
                th.set(new EdgeDriver());
                break;
            case ("firefox"):

                th.set(new FirefoxDriver());
                break;
            default:
                throw new InvalidArgumentException("---Provide valid browser-----");

        }
        getDriver().navigate().to(prob.getProperty("AMurl"));
        getDriver().navigate().refresh();
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        return getDriver();
    }
    public static WebDriver getDriver() {
        return th.get();
    }
}

