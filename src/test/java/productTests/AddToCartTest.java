package productTests;

import Page.CartPage;
import Page.ProductPage;

public class AddToCartTest {
    @Test
    public void addTwoItemsToCart() {
        ProductPage productPage = homePage.clickProductByName("Sauce Labs Backpack");
        productPage.clickAddToCart();
        Assert.assertEquals(productPage.getAlertText(), "Product added", "Wrong alert text");
        productPage.acceptAlert();

        homePage = navigator.returnToHomePage();
        productPage = homePage.clickProductByName("Sauce Labs Bike Light");
        productPage.clickAddToCart();
        productPage.acceptAlert();

        CartPage cartPage = navigator.clickCartButton();
        Assert.assertEquals(cartPage.getProductCount(), "Product count is wrong");
    }

}





