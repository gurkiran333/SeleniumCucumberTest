package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
    public static WebDriver driver;

    public void setUp() {
    WebDriverManager.chromedriver().setup();
    Driver = new ChromeDriver();
    Driver.manage().window().maximize();  //  optional but recommended
    Driver.get("file:///D:/DevOps/Projects/mySeleCucumtest/testpage/login.html");
}

    public void tearDown() {
        if (Driver != null) {
            Driver.quit(); //  properly closes the browser
        }
    }
}
