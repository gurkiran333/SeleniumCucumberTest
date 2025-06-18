package steps;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import io.cucumber.java.en.Then;
import java.time.Duration; // Make sure you import this

public class LoginStep {

    WebDriver driver;

    public LoginStep() {
        // Assuming Hooks.driver is how you manage WebDriver
        this.driver = Hooks.driver;
    }

    @Then("Login with correct username and password")
    public void login_with_correct_username_and_password() {
        //  Fix 3: Log current page
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page title: " + driver.getTitle());

        //  Fix 1/2: Explicit wait for element
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Initial")));

        //  Interact with the field
        WebElement initialField = driver.findElement(By.id("Initial"));
        initialField.sendKeys("your_username");

        // Continue with password, login button, etc.
    }
}
