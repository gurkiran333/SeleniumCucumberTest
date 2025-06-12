package steps;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends Base {
    @Before
    public void InitializeTest(Scenario scenario) {
        System.out.println("Initializing Test: " + scenario.getName());
        setUp();
    }

    @After
    public void CleanUp() {
        tearDown();
    }
}