package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
    public static WebDriver Driver;

    public void setUp() {
        WebDriverManager.chromedriver().setup(); // This sets up ChromeDriver properly
        Driver = new ChromeDriver(); // Corrected this line
        Driver.get("file:///D:/DevOps/Projects/mySeleCucumtest/testpage/login.html"); // Use correct path
    }

    public void tearDown() {
        if (Driver != null) {
            Driver.quit();
        }
    }
}
