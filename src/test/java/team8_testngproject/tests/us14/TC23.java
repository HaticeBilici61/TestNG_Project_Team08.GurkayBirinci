package team8_testngproject.tests.us14;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import team8_testngproject.pages.*;
import team8_testngproject.utilities.ConfigReader;
import team8_testngproject.utilities.Driver;
import team8_testngproject.utilities.ReusableMethods;

public class TC23 { // Tags bölümüne birden fazla tag eklenebilmeli (PASS)
    @Test
    public void tc01(){
        P01_HomePage homePage = new P01_HomePage();
        P03_LoginPage loginPage = new P03_LoginPage();
        P04_MyAccountPage myAccountPage = new P04_MyAccountPage();
        P16_VendorStoreManagerPage vendorStoreManagerPage = new P16_VendorStoreManagerPage();
        P18_VendorProductManagerPage vendorProductManagerPage = new P18_VendorProductManagerPage();

        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        homePage.signInGur.click();
        loginPage.userNameGur.sendKeys(ConfigReader.getProperty("usernameGur"));
        loginPage.passwordGur.sendKeys(ConfigReader.getProperty("passwordGur"));
        loginPage.signInButtonGur.click();

        homePage.signOutGur.click();
        myAccountPage.storeManagerGur.click();
        ReusableMethods.hover(vendorStoreManagerPage.productButtonGur);
        vendorStoreManagerPage.addNewButtonGur.click();

        String tagName = "Avokado, Ananas";
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].value='" + tagName + "';", vendorProductManagerPage.addTagGur);
        String actualText = ((JavascriptExecutor) Driver.getDriver()).executeScript("return arguments[0].value;", vendorProductManagerPage.addTagGur).toString();
        System.out.println(actualText);

        Assert.assertEquals(actualText, tagName);
        Driver.closeDriver();
    }
}
