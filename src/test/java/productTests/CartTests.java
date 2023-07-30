package productTests;

import Page.CartPage;
import Page.ProductPage;

public class CartTests extends BaseTests{
    @Test
    public void totalPriceTest() {
        ProductPage productPage = homePage.clickProductByName("Sauce Labs Backpack");
        productPage.clickAddToCart();
        Assert.assertEquals(productPage.getAlertText(), "Product added", "wrong alrt text");
        productPage.acceptAlert();
        CartPage cartPage = navigator.clickCardButton();
        Assert.assertEquals(cartPage.getTotalPrice(), "43.18","The price is wrong");

    }
    @Test
    public void removeItemFromCardTest() {
        ProductPage productPage = homePage.clickProductByName("Sauce Labs Backpack");
        productPage.clickAddToCart();
        Assert.assertEquals(productPage.getAlertText(), "Product added", "wrong alrt text");
        productPage.acceptAlert();
        CartPage cartPage = navigator.ClickCardButton();
        cartPage.deleteItemFromCart(0);
        Assert.assertEquals(cartPage.productCount(), 0, "Removing product didn' t work");
    }
    @Test
    public void placeOrderTest() {
        ProductPage productPage = homePage.clickProductByName("Sauce Labs Backpack");
        productPage.clickAddToCart();
        productPage.acceptAlert();
        CartPage cartPage = navigator.clickCardButton();
        cartPage.clickPlaceOrder();
        cartPage.setValueByName("First Name", "Dragana");
        cartPage.setValueByName("Last Name", "Savic");
        cartPage.setValueByName("Postal Code", "11000");
        cartPage.clickPurchaseButton();
        Assert.assertEquals(cartPage.getConfirmationMessage(), "Thank you for your order");
    }
}
