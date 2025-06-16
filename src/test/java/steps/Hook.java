package steps;

import base.Base;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hook extends Base {

    @Before
    public void initializeDriver() {
        setUp(); // uses setup method from Base.java
    }

    @After
    public void closeDriver() {
        tearDown(); // uses teardown method from Base.java
    }
}
