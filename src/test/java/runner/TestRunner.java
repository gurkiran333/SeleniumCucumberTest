package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"steps", "hooks", "base"},  // include all packages with step defs and hooks
    plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
)
public class TestRunner {}
