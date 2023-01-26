package FP.stepDef;

import FP.pages.homePageSignIn;
import FP.pages.loginPage;
import io.cucumber.java.en.Then;

public class homeSignInDef {
    @Then("user is on homepage")
    public void homepageValidation() throws InterruptedException {
        homePageSignIn.validateOnPage();
    }
}
