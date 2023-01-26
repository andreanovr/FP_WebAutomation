package FP.pages;

import FP.baseTest;
import org.openqa.selenium.By;

public class homePageSignIn extends baseTest {
    public static void validateOnPage() throws InterruptedException {
        Thread.sleep(5000);
        // Chat Button
        driver.findElement(By.xpath("//*[@id=\"responsive-navbar-nav\"]/div[2]/div/div[1]/button")).isDisplayed();
        // Notification Button
        driver.findElement(By.xpath("//*[@id=\"responsive-navbar-nav\"]/div[2]/div/div[2]/button")).isDisplayed();
    }
}
