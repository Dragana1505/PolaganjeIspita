package login;

import org.testng.annotations.Test;
import org.testng.Assert;
import Page.HomePage;

public class LoginTests extends BaseTests {
    @Test
    public void invalidPasswordTest() {
        navigator.clickLoginButton();
        homePage.setLoginUsername("standard_user");
        homePage.setLoginPassword("12345");
        homePage.clickLoginButton();
        Assert.assertEquals(homePage.getAlertText(), "Epic sadface: Username and password do not match any user in this service", "User not logged in"); // Corrected the expected alert text
        homePage.acceptAlert(); // Corrected method name from aceptAlert to acceptAlert
        homePage.clickCloseButton(); // Assuming there's a method called clickCloseButton() to close the alert or some UI element
    }
}
    @Test
        public void invalidUsernameTest() {
        navigator.clickLoginButton();
        homePage.setLoginUsername("12345");
        homePage.setLoginPassword("secret_sauce");
        homePage.clickLoginButton();
        Assert.assertEquals(homePage.getAlertText(), "Epic sadface: Username and password do not match any user in this service");
}       homePage.aceptAlert();
        homePage.clickCloseButton();
    @Test
        public void successfulLoginTest (){
        navigator.clickLoginButton();
        homePage.setLoginUsername("standard_user");
        homePage.setLoginPassword("secret_sauce");
        homePage.clickLoginButton();
         Assert.assertEquals(navigator.getLogedInUsername(), "Swag Labs");
    }

    }