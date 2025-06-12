package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
    public static WebDriver Driver;

    public void setUp() {
        WebDriverManager.chromedriver().setup(); // Automatically downloads & configures ChromeDriver
        Driver = new ChromeDriver(); // Use Driver here
        Driver.get("file:///D:/DevOps/Projects/mySeleCucumtest/testpage/login.html");
    }

    public void tearDown() {
        if (Driver != null) {
            Driver.quit();
        }
    }
}
