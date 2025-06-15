package steps;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import base.Base;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hook {

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        Base.driver = new ChromeDriver(options); 
        Base.driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        if (Base.driver != null) {
            Base.driver.quit();  
        }
    }
}
