package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
    public static WebDriver Driver;

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Driver = new ChromeDriver(); // assign to static variable
        Driver.get("file:///absolute/path/to/testpage/login.html");
    }

    public void tearDown() {
        if (Driver != null) {
            Driver.quit();
        }
    }
}
