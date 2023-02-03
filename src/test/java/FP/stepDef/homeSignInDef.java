package FP.stepDef;

import FP.pages.homePageSignIn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class homeSignInDef {
    @Then("user is on homepage sign in")
    public void homepageValidation() throws InterruptedException {
        homePageSignIn.validateOnPage();
    }

    @And("user click dropdown button")
    public void dropdownButton() {
        homePageSignIn.clickDropdownButton();
    }

    @And("user click on logout button")
    public void logoutButtonInDropdown() {
        homePageSignIn.clickLogoutButtonInDropdown();
    }

    @And("user click logout on the pop-up")
    public void logoutButtonInPopUp() {
        homePageSignIn.logoutButtonInPopUp();
    }

    @And("user click cancel on the pop-up")
    public void cancelButtonInPopUp() {
        homePageSignIn.cancelButtonInPopUp();
    }

}
