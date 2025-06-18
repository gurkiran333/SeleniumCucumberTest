package hooks;

import base.Base;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks extends Base {

    @Before
    public void initializeDriver() {
        setUp();  // initializes static driver
    }

    @After
    public void closeDriver() {
        tearDown();  // cleans up driver
    }
}
