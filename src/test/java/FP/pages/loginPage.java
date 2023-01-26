package FP.pages;

import FP.baseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class loginPage extends baseTest {
    public static void validateOnPage() {
        // Field Email
        driver.findElement(By.xpath("//*[@id=\"InputEmail\"]")).isDisplayed();
        // Field Password
        driver.findElement(By.xpath("//*[@id=\"InputPassword\"]")).isDisplayed();
        // Button Login
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div[1]/div/form/button")).isDisplayed();
    }


    public static void inputEmail(String email) {
        driver.findElement(By.xpath("//*[@id=\"InputEmail\"]")).sendKeys(email);
    }

    public static void inputPassword(String password) {
        driver.findElement(By.xpath("//*[@id=\"InputPassword\"]")).sendKeys(password);
    }

    public static void clickLogin() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div[1]/div/form/button")).click();
    }
}
