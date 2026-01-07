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
import java.util.Properties;

public class BrowserCall {
    public static WebDriver d;
    public static ChromeOptions options = new ChromeOptions();

    public static WebDriver browserInvoc() throws IOException, InterruptedException {
        FileInputStream fis = new FileInputStream("src/main/resources/Utility/Config.properties");
        Properties prob = new Properties();
        prob.load(fis);
        if (prob.getProperty("browser").equalsIgnoreCase("Edge")) {
            d = new EdgeDriver();
        } else if (prob.getProperty("browser").equalsIgnoreCase("Chrome")) {
            d = new ChromeDriver();
            options.addArguments("--remote-allow-origins=*");
        } else if (prob.getProperty("browser").equalsIgnoreCase("Firefox")) {
            d = new FirefoxDriver();
        } else {
            throw new InvalidArgumentException("--provide enter valid browser--");
                    //("--provide enter valid browser--");
        }
        d.manage().window().maximize();
        d.get(prob.getProperty("AMurl"));
        return d;
    }
}
