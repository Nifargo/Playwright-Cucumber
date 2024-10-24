package base;

import com.microsoft.playwright.Page;
import utils.PlaywrightDriver;

public class CarBase {

    public Page page;

    public CarBase(Page page) {

        this.page = page;
    }

    public String getCarTitle() {

        return page.locator(PlaywrightDriver.OR.getProperty("carTitle_XPATH")).innerText();

    }
}
