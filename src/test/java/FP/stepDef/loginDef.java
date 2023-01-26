package FP.stepDef;

import FP.pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginDef {
    @Then("user is on login page")
    public void homepageValidation() throws InterruptedException{
        loginPage.validateOnPage();
    }

    @And("user input email with {string}")
    public void inputEmailField(String email) {
        loginPage.inputEmail(email);
    }

    @When("user click on login button")
    public void clickLogin() {
        loginPage.clickLogin();
    }

    @And("user input password with {string}")
    public void inputPasswordField(String password) {
        loginPage.inputPassword(password);
    }
}
