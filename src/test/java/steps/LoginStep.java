package steps;

import base.Base;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStep extends Base {
    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        Assert.assertTrue("Its not displayed", driver.findElement(By.id("Initial")).isDisplayed());
    }
}
