package steps;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import io.cucumber.java.en.Then;
import base.Base;  // not from hooks

import java.time.Duration;

public class LoginStep {

    WebDriver driver = Base.driver; // Accessing static driver directly

    @Then("Login with correct username and password")
    public void login_with_correct_username_and_password() {
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page title: " + driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Initial")));

        WebElement initialField = driver.findElement(By.id("Initial"));
        initialField.sendKeys("your_username");

        // Add password and click login as needed
    }
}
