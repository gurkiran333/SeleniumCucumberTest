package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public static WebDriver Driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        Driver = new ChromeDriver();
        Driver.get("file:///absolute/path/to/testpage/login.html");
    }

    public void tearDown() {
        if (Driver != null) {
            Driver.quit();
        }
    }
}