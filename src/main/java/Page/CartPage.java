package Page;

import java.time.Duration;
import java.util.List;

public class CartPage {
    private WebDriver driver;
    // private By checkoutButton = By.cssSelector("Btn btn action btn_medium check out_button");
    // private By firstNameField = By.id("first-name");
    //private By lastNameField = By.id("last-name");
    //private By postalCodeField = By.id("postal-code");
    // private By finishField = By.id("finish");
    private By confirmationMessage = By.cssSelector("contents_wrapper");
    private By allRowsSelector = By.cssSelector("cart_list");
    private By totalPrice = By.id("Price Total");
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

}
}
    public void clickPlaceOrder() {
        driver.findElement(checkoutButton).click();
    }
    public void setValueByName(String fieldName, String value){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(expectedConditions.visibilityOfElementLocated(By.id("first-name")));
        driver.findElement(By.id(fieldName.toLowerCase())).sendCasse(value);
    }


    public void setValueByName(String fieldFirstName,String value) {
        driver.findElement(By.id(fieldFirstName.toLowerCase())).sendKeys(value);
    }
    public void clickPurchaseButton() {
        driver.findElement(purchaseButton().click();

    }
    public void clickCloseBatton() {
        driver.findElement(closeBatton).click();

    }
    public int productCount() {
        this.waitForProductTableToLoad();
        var allRows = rowsColection();
       return allRows.size();
    }
    public String getTotalPrice(){
        this.waitForCartToLoad();
        return driver.findElement(totalPrice).getText();
    }
   public void deleteItemFromCart(int itemIndex) {
        this.waitForProductTableToLoad();
        var allRows = rowsColection();
        allRows.get(itemIndex).findElement(By.linkText("Delete")).click();
   }

    private void waitForTotalProiceToLoad() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(totalPrice));
    }
    private void waitForProductTableToLoad() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.invisibilityOfElementLocaded(By.cssSelector("tbody tr")));

    }

    private List<WebElement> rowsColection() {
        return driver.findElements(allRowsSelector);
}

    public String getConfirmationMessage(){
        return driver.findElement(confirmationMessage).getText();
    }
}

