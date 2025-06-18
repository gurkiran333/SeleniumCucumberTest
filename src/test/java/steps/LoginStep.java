package steps;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import io.cucumber.java.en.Then;
import base.Base;

import java.time.Duration;

public class LoginStep {

    WebDriver driver = Base.driver;

    @Then("Login with correct username and password")
    public void login_with_correct_username_and_password() {
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page title: " + driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Initial")));

        WebElement initialField = driver.findElement(By.id("Initial"));
        initialField.sendKeys("your_username");
    }

    @Then("I should see the userform page")
    public void i_should_see_the_userform_page() {
        String expectedTitle = "User Form";
        String actualTitle = driver.getTitle();

        System.out.println("Verifying page title...");
        if (!actualTitle.contains(expectedTitle)) {
            throw new AssertionError("Expected page title to contain '" + expectedTitle + "' but was '" + actualTitle + "'");
        }
    }
}
