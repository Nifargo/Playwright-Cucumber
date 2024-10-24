package pages;
import base.BasePage;

public class HomePage extends BasePage {

    public void mouseHoverToNewCars() {
        mouseHover("newCarsMenu_XPATH");
    }

    public void clickOnFindNewCars() {
        click("findNewCars_XPATH");
    }
}
