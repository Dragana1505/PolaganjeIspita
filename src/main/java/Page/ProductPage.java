ackage Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ProductPage {
    private WebDriver driver;
    private By addToCartButton = By.linkText("Add to cart");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
}

   }

public void clickAddToCart() {
        waitToProductPageToLoad();
        driver.findElement(addToCartButton).click();
        }

}
private void waitToProductPageToLoad() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Increased wait time to 10 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
        }
//public String getAlertText() {
      //  return driver.switchTo().alert().getText();
//public void acceptAlert() {
  //      driver.switchTo().alert().accept();
}
private void waitToAlertToBecomeVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
}