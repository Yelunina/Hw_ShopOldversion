package com.ait.qa34;

import org.testng.annotations.BeforeMethod;

public class AddItemToCart extends TestBase{
    @BeforeMethod
    public void ensurePrecondition() {
        clickOnLoginLink();
        fillLoginRegisterForm();
        clickOnLoginButton();
    }
}
