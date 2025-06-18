package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public static WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D://DevOps//Projects//SeleniumCucumberTest//path//to//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D://DevOps//Projects//mySeleCucumtest//testpage//login.html");
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
