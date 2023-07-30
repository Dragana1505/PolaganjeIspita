package Common;
import Page.CartPage;
import Page.HomePage;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class Navigator {
    private WebDriver driver;
    private By homeLink = By.patialLinkText("Home");
    private By aboutLink = By.linkText("About");
    private By logoutLink = By.linkText("Logout");
    private By resetAppStateLink = By.linkText("Reset App State");
    private By loginLink = By.id("Login");
    private By loggedInUser = By.id("nameofuser");


    public Navigator(WebDriver driver) {

        this.driver = driver;
    }
    public HomePage returnToHomePage() {
driver.findElement(HomePage).click();
return new HomePage(driver);
    }
    public CartPage clickCartButton(){
    driver.findElement(CartLink).click();
    return new CartPage(driver);
}
 public void clickLoginButton() {
        driver.findElement(loginLink).click();
 }
 public String getLoggedInUsername(){
        return driver.findElement(loggedInUser).getText();

 }