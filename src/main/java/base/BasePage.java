package base;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;
import utils.PlaywrightDriver;
import static org.junit.jupiter.api.Assertions.*;


public class BasePage {

    public static Page page;
    public static  CarBase carBase;

    public BasePage() {
        page = PlaywrightDriver.getPage();
        carBase = new CarBase(page);
    }

    public void click(String locatorKey) {

        try {
            page.locator(PlaywrightDriver.OR.getProperty(locatorKey)).click();
        } catch (Throwable t) {

            fail(t.getMessage());
        }
    }

    public void mouseHover(String locatorKey) {

        try {
            page.hover(PlaywrightDriver.OR.getProperty(locatorKey));
        } catch (Throwable t) {

            fail(t.getMessage());
        }
    }

    public boolean isElementPresent(String locatorKey) {

        try {
            page.waitForSelector(PlaywrightDriver.OR.getProperty(locatorKey), new Page.WaitForSelectorOptions().setTimeout(2000));

            return true;
        } catch (Throwable t) {


            return false;
        }
    }

        public void type(String locatorKey, String value) {
            try {
                page.locator(PlaywrightDriver.OR.getProperty(locatorKey)).fill(value);
            } catch (Throwable t) {

                fail(t.getMessage());
            }
        }

        public void select(String locatorKey, String value) {
            try {
                page.selectOption(PlaywrightDriver.OR.getProperty(locatorKey),new SelectOption().setLabel(value));
            } catch (Throwable t) {

                fail(t.getMessage());
            }
        }

}
