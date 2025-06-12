package steps;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Base {

    @Before
    public void InitializeTest() {
        setUp();
    }

    @After
    public void CleanUp() {
        tearDown();
    }
}
