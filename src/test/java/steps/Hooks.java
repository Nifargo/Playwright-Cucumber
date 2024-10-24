package steps;

import com.microsoft.playwright.Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.PlaywrightDriver;

import java.nio.file.Paths;

public class Hooks {

    public Page page;

    @Before()
    public void setUp() {
        PlaywrightDriver.setupDriver();
    }

    @After()
    public void tearDown(Scenario scaenario) {

        if (scaenario.isFailed()) {
            page = PlaywrightDriver.getPage();
            byte[] screenshot = page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./screenshots/" + scaenario.getName() + ".png")));
            scaenario.attach(screenshot, "image/png", "screenshot");
        }

        PlaywrightDriver.closeBrowser();
        PlaywrightDriver.tearDown();
    }
}
