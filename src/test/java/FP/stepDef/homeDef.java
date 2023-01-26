package FP.stepDef;

import FP.pages.homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class homeDef {

    @Given("user is on home page")
    public void userIsOnHomePage() {
        homePage.validateOnPage();
    }
    @Then("user choose Masuk")
    public void masukButton() {
        homePage.masukButton();
    }

    @Then("user choose Pencari Kost")
    public void pencariKostButton() {
        homePage.pencariKostButton();
    }

    @Then("user choose Penyewa Kost")
    public void penyewaKostButton() {
        homePage.penyewaKostButton();
    }
}
