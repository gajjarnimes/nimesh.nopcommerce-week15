package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Homepage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    Homepage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new Homepage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToComputer() {
        homePage.selectMenu("Computers");
        Assert.assertEquals(homePage.getVerifyComputer(), "Computers", "Error Message not displayed");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToElectronics() {
        homePage.selectMenu("Electronics");
        Assert.assertEquals(homePage.getVerifyElectronics(), "Electronics", "Error Message not displayed");
    }

    @Test(groups = "regression")
    public void verifyUserShouldNavigateToApparel() {
        homePage.selectMenu("Apparel");
        Assert.assertEquals(homePage.getVerifyElectronics(), "Electronics", "Error Message not displayed");
    }
}
