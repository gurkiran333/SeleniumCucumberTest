package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    // Make this static if you want to access it from Hooks or Step classes without creating a new object
    public static WebDriver driver;

    public WebDriver setUp() {
        //  Fix the path: remove "path/to/" and use actual path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "D:\\DevOps\\Projects\\SeleniumCucumberTest\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //  Make sure the HTML file path is correct
        driver.get("file:///D:/DevOps/Projects/mySeleCucumtest/testpage/login.html");

        return driver;
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
