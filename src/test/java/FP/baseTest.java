package FP;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.time.Duration;

public class baseTest {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    public static void setupDriver() throws MalformedURLException {
        ChromeOptions options=new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://omahkos.biz.id/");
        Assert.assertEquals(driver.getTitle(), "Omah Kos");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public static void stopDriver() {
        driver.quit();
    }

    public static void resetApp() {
        driver.close();
    }
}
