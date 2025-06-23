package steps;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import io.cucumber.java.en.Then;
import base.Base;
import org.junit.Assert;
import java.time.Duration;

public class LoginStep {

    WebDriver driver;

    @Then("Login with correct username and password")
    public void login_with_correct_username_and_password() {
        driver = Base.driver;

        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page title: " + driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        driver.findElement(By.id("username")).sendKeys("testuser");
        driver.findElement(By.id("password")).sendKeys("testpass");
        driver.findElement(By.id("loginBtn")).click();
    }

    @Then("I should see the userform page")
    public void i_should_see_the_userform_page() {
        driver = Base.driver;

        String actualTitle = driver.getTitle();
        System.out.println("Page title: " + actualTitle);

        Assert.assertTrue("Page title is empty or missing", actualTitle != null && !actualTitle.isEmpty());
        Assert.assertTrue("Expected title to contain 'Login Page' but got: " + actualTitle,
                actualTitle.contains("Login Page"));
    }
}
