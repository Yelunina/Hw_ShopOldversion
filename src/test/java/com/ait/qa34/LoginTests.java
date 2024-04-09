package com.ait.qa34;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @Test
    public void loginPositiveTest() {
        clickOnLoginLink();
        fillLoginRegisterForm();
        clickOnLoginButton();
        Assert.assertTrue(isSignOutButtonPresent());
    }

    @Test
    public void loginNegativeTestWithoutEmail() {
        clickOnLoginLink();
        fillLoginRegisterForm();
        clickOnLoginButton();
        Assert.assertTrue(isAlertPresent());
    }
}
