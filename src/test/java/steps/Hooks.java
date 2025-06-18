// File: Hooks.java
package hooks;

import base.Base;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;

public class Hooks extends Base {

    public static WebDriver driver;

    @Before
    public void initializeDriver() {
        driver = setUp();
    }

    @After
    public void closeDriver() {
        tearDown();
    }
}
