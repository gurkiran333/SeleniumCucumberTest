package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
    public static WebDriver driver;

    public void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless=new"); // enable in CI
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        driver = new ChromeDriver(options);  
        driver.manage().window().maximize(); 
        driver.get("file:///D://DevOps//Projects//mySeleCucumtest//testpage//login.html");
    }

    public void tearDown() {
        if (driver != null) {   
            driver.quit();
        }
    }
}
