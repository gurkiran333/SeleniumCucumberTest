package steps;

import base.Base;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginStep extends Base {

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until the element is present and visible
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Initial")));

        Assert.assertTrue("User form is not visible", element.isDisplayed());
    }
}
