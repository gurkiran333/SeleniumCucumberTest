@Then("Login with correct username and password")
public void login_with_correct_username_and_password() {
    // ⬇ Fix 3: Add debug logs
    System.out.println("Current URL: " + driver.getCurrentUrl());
    System.out.println("Page title: " + driver.getTitle());

    // ⬇ Fix 1/2: Explicit wait for the element
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Initial")));
    // OR, if ID might be incorrect:
    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Initial']")));

    // ⬇ Interaction with the input field
    WebElement initialField = driver.findElement(By.id("Initial"));
    initialField.sendKeys("your_username");
}
