package singUp;

import org.testng.annotations.Test;
import org.testng.Assert;
import Page.HomePage;

public class SingUpTests extends BaseTests {
    @Test
    public void successfulLoginTest() {
        navigator.clickLoginButton();
        homePage.setLoginUsername("standard_user");
        homePage.setLoginPassword("secret_sauce");
        homePage.clickLoginButton();
        homePage.acceptAlert();
    }

    @Test
    public void signUpWithExistingUserTest() {
        homePage.setLoginUsername("standard_user1");
        homePage.setLoginPassword("secret_sauce");
        homePage.clickLoginButton();
        Assert.assertEquals(homePage.getAlertText(), "This user already exists.", "User is signed up");
        homePage.acceptAlert();
    }
}

