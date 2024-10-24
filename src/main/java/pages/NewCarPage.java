package pages;
import base.BasePage;

public class NewCarPage extends BasePage {

    public void gotoHonda() {
        click("honda_XPATH");
    }

public void gotoToyota() {
        click("toyota_XPATH");
    }

    public void gotoBMW() {
        click("bmw_XPATH");
    }

    public void gotoKia() {
        click("kia_XPATH");
    }
}
