package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

package Page;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private By logginUsername = By.id("Username");
    private By logginPassword = By.id("form_group");
    private By logginButton = By-id(".//button[text()='Login']");
    protected HomePage homePage;
    public HomePage(WebDriver driver) {
        this.driver = driver;

    }
        public ProductPage ClickProductByName(String productName) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(productName)));
            driver.findElement(By.linkText(productName)).click();
            return new ProductPage(driver);
        }

public String getCurentUrl() {
        return driver.getCurentUrl();

    }
    public void clickLogginButton() {
        driver.findElement(logginButton).click();
    }

    public void setLogginUsername(String username) {
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementlocated(LogginUsername));
        driver.findElement(logginUsername).sendKeys(username);
    }
    public void setLogginPassword(String password) {
        driver.findElement(logginPassword).sendKeys(password);
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
    }

