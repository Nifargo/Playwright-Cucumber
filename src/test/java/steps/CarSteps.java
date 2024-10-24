package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.HomePage;
import pages.NewCarPage;
import utils.PlaywrightDriver;
import base.BasePage;

public class CarSteps {

    HomePage home = new HomePage();
    NewCarPage newCar = new NewCarPage();

    @Given("user navigates to carwale website")
    public void user_navigates_to_carwale_website() {

        PlaywrightDriver.openPage(PlaywrightDriver.config.getProperty("testsiteurl"));

    }
    @When("user mousover to newcars")
    public void user_mousover_to_newcars() {

        home.mouseHoverToNewCars();

    }
    @Then("user clics on findsnewCars link")
    public void user_clics_on_findsnew_cars_link() {

        home.clickOnFindNewCars();

    }
    @Then("user clicks on {string} car")
    public void user_clicks_on_car(String carBrand) {

        switch (carBrand) {
            case "Honda" -> newCar.gotoHonda();
            case "Toyota" -> newCar.gotoToyota();
            case "BMW" -> newCar.gotoBMW();
            case "Kia" -> newCar.gotoKia();
        }

    }
    @Then("user validates carTitle as {string}")
    public void user_validates_car_title_as(String carTitle) {

        System.out.println("Car Title is : "+ BasePage.carBase.getCarTitle());
        Assertions.assertEquals(carTitle, BasePage.carBase.getCarTitle());

    }
}
