package Steps;

import PageObject.FlutterHomePage;
import Setups.Capabilities;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class FlutterAppSteps extends Capabilities {
    @Before({"@Flutter"})
    public void setup() throws Exception {
        preparation();
    }

    @Given("^User go to the Shrine Gallery$")
    public void goToShrineGallery() throws Throwable {
        FlutterHomePage flutterHomePage = new FlutterHomePage(driver);
        flutterHomePage.openShrineGallery();
    }

    @When("^User add items to the cart and clear the cart$")
    public void userAddItemsToTheCartAndClearTheCart() throws Throwable {
        FlutterHomePage flutterHomePage = new FlutterHomePage(driver);
        flutterHomePage.addToShoppingCart();
    }

    @And("^User clear the cart$")
    public void userClearTheCart() throws Throwable {
        FlutterHomePage flutterHomePage = new FlutterHomePage(driver);
        flutterHomePage.clearTheCart();
    }

    @Then("^Cart should be empty$")
    public void cartShouldBeEmpty() {
    }

    @After({"@Flutter"})
    public void stop(){
        stopServer();
    }
}