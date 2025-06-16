public void setUp() {
    WebDriverManager.chromedriver().setup();

    ChromeOptions options = new ChromeOptions();
    // options.addArguments("--headless=new");
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");

    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.get("file:///D://DevOps//Projects//mySeleCucumtest//testpage//login.html");
}
