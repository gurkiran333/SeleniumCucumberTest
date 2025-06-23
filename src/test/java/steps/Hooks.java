package hooks;

import base.Base;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {
    Base base = new Base();

    @Before
    public void beforeScenario() {
        base.setUp();  // initializes driver
    }

    @After
    public void afterScenario() {
        base.tearDown();  // closes browser
    }
}
