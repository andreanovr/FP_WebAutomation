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

    public static void clickDropdownButton() {
        driver.findElement(By.xpath("//*[@id=\"dropdown-basic-button\"]")).click();
    }

    public static void clickLogoutButtonInDropdown() {
        driver.findElement(By.xpath("//*[@id=\"responsive-navbar-nav\"]/div[2]/div/div[3]/div/div/a[5]")).click();
    }

    public static void logoutButtonInPopUp() {
        driver.findElement(By.xpath("//*[@id=\"logout\"]/div/div/div/div[1]/button/div")).click();
    }

    public static void cancelButtonInPopUp() {
        driver.findElement(By.xpath("//*[@id=\"logout\"]/div/div/div/div[2]/button/div")).click();
    }
}
