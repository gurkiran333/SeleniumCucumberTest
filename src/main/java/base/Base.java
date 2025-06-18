public class Base {
    public static WebDriver driver; // make it static

    public WebDriver setUp() {
        System.setProperty("webdriver.chrome.driver", "D://DevOps//Projects//SeleniumCucumberTest//path//to//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D://DevOps//Projects//mySeleCucumtest//testpage//login.html");
        return driver;
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
