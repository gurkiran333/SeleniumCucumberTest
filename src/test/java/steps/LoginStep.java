package steps;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import io.cucumber.java.en.Then;
import java.time.Duration;
import hooks.Hooks;

public class LoginStep {

    WebDriver driver;

    public LoginStep() {
        this.driver = Hooks.driver;
    }

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
        System.out.println("Verifying userform page is displayed");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userform")));

        String title = driver.getTitle();
        if (!title.toLowerCase().contains("userform")) {
            throw new AssertionError("Userform page not displayed. Current title: " + title);
        }
    }
}
