package FP.pages;

import FP.baseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.time.Duration;

public class homePage extends baseTest {

    public static void validateOnPage() {
        // Button Login
        driver.findElement(By.xpath("//*[@id=\"responsive-navbar-nav\"]/div[2]/div/div[1]/button")).isDisplayed();
    }

    public static void pencariKostButton() {
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/button[1]/div/div/div[2]")).click();
    }

    public static void penyewaKostButton() {
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/button[2]/div/div/div[2]")).click();
    }

    public static void masukButton() {
        driver.findElement(By.xpath("//*[@id=\"responsive-navbar-nav\"]/div[2]/div/div[1]/button")).click();
    }
}
